// Last updated: 7/9/2026, 3:09:41 PM
class Solution {
    public int[] dailyTemperatures(int[] t) {
    int [] res=new int[t.length];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<t.length;i++){
        while(!s.empty() && t[s.peek()] <t[i]){
            res[s.peek()] = i-s.pop();

        }
        s.push(i);
    }
    return res;
    }
}