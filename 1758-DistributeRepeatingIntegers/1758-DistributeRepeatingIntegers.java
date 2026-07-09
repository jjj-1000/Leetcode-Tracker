// Last updated: 7/9/2026, 3:07:57 PM
class Solution {

    public boolean canDistribute(int[] nums, int[] quantity) {

      
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        int[] freq = new int[map.size()];
        int index = 0;

        for (int value : map.values()) {
            freq[index++] = value;
        }

        
        Arrays.sort(quantity);
        reverse(quantity);

        return backtrack(0, quantity, freq);
    }

    private boolean backtrack(int customer, int[] quantity, int[] freq) {

       
        if (customer == quantity.length) {
            return true;
        }

        for (int i = 0; i < freq.length; i++) {

            
            if (freq[i] >= quantity[customer]) {

                freq[i] -= quantity[customer];

                if (backtrack(customer + 1, quantity, freq)) {
                    return true;
                }

                // Backtrack
                freq[i] += quantity[customer];
            }
        }

        return false;
    }

    
    private void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}