class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int nlen = numbers.length;
        int l, r;
        l = 0; r = nlen - 1;
        int[] out = new int[2];
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l+1, r+1};
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{};
    }
}
