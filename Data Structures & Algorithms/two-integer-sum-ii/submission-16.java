class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int nlen = numbers.length;
        int l, r;
        l = 0; r = nlen - 1;
        int[] out = new int[2];
        while (true) {
            if (numbers[l] + numbers[r] != target) {
                if (target < numbers[l] + numbers[r]) {
                    r--;
                } else {
                    l++;
                }
            } else {
                out[0] = l+1;
                out[1] = r+1;
                break;
            } 
        }
        return out;
    }
}
