class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {return 0;}
        char[] stray = s.toCharArray();
        int res = 0;
        for (int i = 0; i < stray.length; i++) {
            Set<Character> longest = new HashSet<>();
            for (int j = i; j < stray.length; j++) {
                if (longest.contains(stray[j])) {
                    break;
                }
                longest.add(stray[j]);
            }
            res = Math.max(res, longest.size());
        }
        return res;
    
    }
}
