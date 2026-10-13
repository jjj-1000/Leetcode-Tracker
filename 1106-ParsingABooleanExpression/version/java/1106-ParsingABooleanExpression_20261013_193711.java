// Last updated: 10/13/2026, 7:37:11 PM
1class Solution {
2    public boolean parseBoolExpr(String expression) {
3        Stack<Character> stk = new Stack<>();  
4
5
6        for (char c : expression.toCharArray()) {
7           
8            if (c != ')' && c != ',') stk.push(c);
9            else if (c == ')') { 
10                ArrayList<Boolean> exp = new ArrayList<>();  
11                
12               
13                while (!stk.isEmpty() && stk.peek() != '(') {
14                    char t = stk.pop();
15                    if (t == 't') exp.add(true);
16                    else exp.add(false);
17                }
18                
19                stk.pop();  
20                
21                if (!stk.isEmpty()) {
22                    char t = stk.pop();  
23                    boolean v = exp.get(0);  
24                   
25                    if (t == '&') {  
26                        for (boolean b : exp) v &= b;
27                    } else if (t == '|') {  // OR operation
28                        for (boolean b : exp) v |= b;
29                    } else {  // NOT operation
30                        v = !v;
31                    }
32                    
33                  
34                    if (v) stk.push('t');
35                    else stk.push('f');
36                }
37            }
38        }
39
40    
41        return stk.peek() == 't';
42    }
43}