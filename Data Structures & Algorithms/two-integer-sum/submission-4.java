class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] toRet = new int[2];
        Map<Integer, Integer> comps = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (comps.containsKey(target - nums[i])) {
                toRet[0] = comps.get(target - nums[i]);
                toRet[1] = i;
                return toRet;
            }
            comps.put(nums[i], i);
        }
        return toRet;
    }
}
