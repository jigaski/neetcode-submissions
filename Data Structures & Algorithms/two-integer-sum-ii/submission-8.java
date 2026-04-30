class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> sofar = new HashMap<>();
        int[] out = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int getMe = target - numbers[i];
            if (sofar.containsKey(getMe)) {
                int indi1 = sofar.get(getMe);
                if (indi1 < i) {
                    out[0] = indi1+1;
                    out[1] = i+1;
                    break;
                } else {
                    out[0] = i+1;
                    out[1] = indi1+1;
                    break;
                }
            } 
            sofar.put(numbers[i], i);
        }
        return out;
    }
}
