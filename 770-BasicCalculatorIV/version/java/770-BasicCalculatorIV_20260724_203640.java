// Last updated: 7/24/2026, 8:36:40 PM
1class Solution {
2    int n;
3    String s;
4    char[] arr;
5    int[] braces;
6    HashMap<String, Integer> variables = new HashMap<>();
7    
8    public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
9        // Initialize stuff
10        s = expression;
11        arr = s.toCharArray();
12        n = arr.length;
13        braces = new int[n];
14        Arrays.fill(braces, -1);
15        int[] stack = new int[n/2];
16        int index = -1;
17        for(int i=0; i<n; ++i) {
18            if(arr[i] == '(') stack[++index] = i;
19            else if(arr[i] == ')') {
20                int last = stack[index--];
21                braces[last] = i;
22                braces[i] = last;
23            }
24        }
25        for(int i=0; i<evalvars.length; ++i) variables.put(evalvars[i], evalints[i]);
26        
27        // Call the main parser which opens all brackets to the deepest levels and creates Terms
28        List<Term> terms = dewIt(0, n-1);
29        
30        // Create map to collapse and sort Terms
31        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<>() {
32            public int compare(String a, String b) {
33                int ca = countStars(a), cb = countStars(b);
34                if(ca != cb) return cb - ca;
35                else return a.compareTo(b);
36            }
37            
38            private int countStars(String s) {
39                int ans = 0;
40                for(char c: s.toCharArray()) if(c == '*') ++ans;
41                return ans;
42            }
43        });
44        for(Term term: terms) {
45            if(term.coeff != 0) {
46                String key = term.getKey();
47                if(map.containsKey(key)) {
48                    int oldCoeff = map.get(key);
49                    if(oldCoeff == -term.coeff) map.remove(key);
50                    else map.put(key, oldCoeff + term.coeff);
51                } else map.put(key, term.coeff);
52            }
53        }
54        
55        // Convert map to list
56        List<String> ans = new LinkedList<>();
57        for(String k: map.keySet()) ans.add(map.get(k) + "" + k);
58        return ans;
59    }
60    
61    private List<Term> dewIt(int a, int b) {
62        if(braces[a] == b) return dewIt(a+1, b-1);
63        List<Term> ans = new LinkedList<>(), buffer = new LinkedList<>();
64        buffer.add(new Term(1, new LinkedList<>()));
65        for(int i=a; i<=b; ) {
66            int j = i;
67            List<Term> curr = null;
68            if(arr[i] == '(') {
69                j = braces[i] + 1;
70                curr = dewIt(i+1, j-2);
71            }
72            else {
73                while(j <= b && arr[j] != ' ') ++j;
74                String exp = s.substring(i, j);
75                int val = 1;
76                List<String> vars = new LinkedList<>();
77                if(variables.containsKey(exp)) val = variables.get(exp);
78                else if (exp.charAt(0) <= '9') val = Integer.valueOf(exp);
79                else vars.add(exp);
80                curr = new LinkedList<>();
81                curr.add(new Term(val, vars));
82            }
83            buffer = multiply(buffer, curr);
84            if(j > b || arr[j+1] == '+' || arr[j+1] == '-') {
85                ans.addAll(buffer);
86                buffer = new LinkedList<>();
87            }
88            if(j < b) {
89                ++j;
90                if(arr[j] == '+') buffer.add(new Term(1, new LinkedList<>()));
91                else if(arr[j] == '-') buffer.add(new Term(-1, new LinkedList<>()));
92                j += 2;
93            }
94            i = j;
95        }
96        return ans;
97    }
98    
99    private List<Term> multiply(List<Term> a, List<Term> b) {
100        List<Term> ans = new LinkedList<>();
101        for(Term x: a) for(Term y: b) {
102            Term prod = x.clone();
103            prod.multiply(y);
104            ans.add(prod);
105        }
106        return ans;
107    }
108}
109
110class Term {
111    int coeff;
112    List<String> vars;
113
114    public Term(int a, List<String> c) {
115        this.coeff = a;
116        vars = new LinkedList<>();
117        vars.addAll(c);
118    }
119
120    public String getKey() {
121        StringBuilder b = new StringBuilder();
122        Collections.sort(vars);
123        for(String x: vars) {
124            b.append('*');
125            b.append(x);
126        }
127        return b.toString();
128    }
129
130    public void multiply(Term that) {
131        this.coeff *= that.coeff;
132        if(this.coeff == 0) vars.clear();
133        else this.vars.addAll(that.vars);
134    }
135
136    public Term clone() {
137        return new Term(coeff, vars);
138    }
139}