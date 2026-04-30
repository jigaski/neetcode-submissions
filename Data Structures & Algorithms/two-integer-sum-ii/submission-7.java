class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //1233456777777890
        /// 1 indexed, store the number and its index, can't use same index twice
        Map<Integer, Integer> sofar = new HashMap<>();
        //(1, 1)
        int[] out = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int getMe = target - numbers[i];
            System.out.println(getMe);
            if (sofar.containsKey(getMe)) {
                int indi1 = sofar.get(getMe);
                if (indi1 < i) {
                    out[0] = indi1+1;
                    out[1] = i+1;
                } else {
                    out[0] = i+1;
                    out[1] = indi1+1;
                }
            } 
            sofar.put(numbers[i], i);
        }
        return out;
    }
}
