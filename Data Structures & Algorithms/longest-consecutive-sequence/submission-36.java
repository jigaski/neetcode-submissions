class Solution {
    public int getConsecUp(int c, int num, Set<Integer> sofar) {
        int consecs = c;
        if (sofar.contains(num+1)){
            consecs = getConsecUp(consecs+1, num+1, sofar);
        }
        return consecs;

    }
    public int getConsecDown(int c, int num, Set<Integer> sofar) {
        int consecs = c;
        if (sofar.contains(num-1)){
            consecs = getConsecDown(consecs+1, num-1, sofar);
        }
        return consecs;

    }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) {return 1;}
        Set<Integer> sofar = new HashSet<>();
        Map<Integer, Integer> consecs = new HashMap<>();
        for (Integer num : nums) sofar.add(num);
        for (Integer num : nums) {
        int total = 0;
        if (sofar.contains(num - 1)) total += getConsecDown(1, num-1, sofar);
        if (sofar.contains(num + 1)) total += getConsecUp(1, num+1, sofar);
        if (total > 0) consecs.put(num, total + 1); // +1 for num itself
                }
        if (nums.length == 0) return 0;
        if (consecs.isEmpty()) return 1;
        return Collections.max(consecs.values());
    }
}
