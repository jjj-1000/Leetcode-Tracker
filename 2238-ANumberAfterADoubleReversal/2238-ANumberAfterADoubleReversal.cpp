// Last updated: 7/9/2026, 3:07:25 PM
class Solution {
public:
    bool isSameAfterReversals(int n) {
        
        
        if(n==0){
            return true;
        }else if(n%10==0){
            return false;
        }else{
            return true;
        }
    }
};