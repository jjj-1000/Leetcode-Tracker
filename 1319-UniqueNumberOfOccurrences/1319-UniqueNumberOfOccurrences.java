// Last updated: 7/9/2026, 3:08:49 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq= new int[2001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+1000]++;
        }
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
              if(set.contains(freq[i])){
                return false;
              }else{
                set.add(freq[i]);
              }
            }
            
        }
        return true;
    }
}