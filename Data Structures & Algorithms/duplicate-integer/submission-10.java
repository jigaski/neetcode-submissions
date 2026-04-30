class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> exists = new HashMap<>();
        for (Integer num : nums) {
            if (exists.getOrDefault(num, 0) == 0) {
                exists.put(num, 1);
            } else {
                return true;
            }
        }
    return false;
    }
}