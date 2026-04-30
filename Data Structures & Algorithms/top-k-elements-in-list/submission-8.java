class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int i;
        for (i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i],0) + 1);
        }
        int[] res = new int[k];
        while (k != 0) {
            int topVal = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
            res[k-1] = topVal;
            freq.remove(topVal);
            k--;
        }
        return res;
    }
}
