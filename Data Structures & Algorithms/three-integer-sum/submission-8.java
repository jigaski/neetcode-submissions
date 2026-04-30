class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        int l, r;
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            l = i + 1;
            r = nums.length - 1;
            int target = -(nums[i]);
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    if (!out.contains(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]))))
                    {
                        out.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    }
                    r--;
                    l++;
                } else if (nums[l] + nums[r] > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return out;
 
    }
}
