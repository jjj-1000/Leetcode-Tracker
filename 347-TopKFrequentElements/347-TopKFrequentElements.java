// Last updated: 7/9/2026, 3:11:07 PM
class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        while (k > 0) {

            int max = 0;
            int element = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > max) {

                    max = entry.getValue();
                    element = entry.getKey();
                }
            }

            list.add(element);

            map.remove(element);

            k--;
        }

        int[] ans = new int[list.size()];
 
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}