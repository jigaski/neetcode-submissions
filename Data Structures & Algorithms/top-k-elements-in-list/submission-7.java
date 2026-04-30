class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int i;
        for (i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i],0) + 1);
        }
        System.out.println(freq);
        int[] res = new int[k];
        //return the KEY with the highest VALUE
        while (k != 0) {
            int topVal = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
            res[k-1] = topVal;
            freq.remove(topVal);
            k--;
        }
        return res;
    }
}
