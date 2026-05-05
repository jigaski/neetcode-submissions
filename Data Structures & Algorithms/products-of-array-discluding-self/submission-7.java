class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];
        for (i = 0; i < nums.length; i++) {
            if (i > 0) {
                prefix[i] = nums[i] * prefix[i - 1];
            } else {
                prefix[i] = nums[i]; 
            }
        }
        for (i = nums.length - 1; i > -1; i--) {
            if (i != nums.length - 1) {
                suffix[i] = nums[i] * suffix[i + 1];
            } else {
                suffix[i] = nums[i];
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = suffix[i+1]; 
            } else if (i == nums.length - 1) {
                res[i] = prefix[i - 1];
            } else {
                res[i] = prefix[i - 1] * suffix[i + 1];
            }
        }
        return res;
    }  
}  
