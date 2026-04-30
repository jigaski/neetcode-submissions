class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {return 0;}
        int res = 0;
        int l = 0;
        int r = 0;
        Set<Character> length = new HashSet<>();
        while(r < s.length()) {
            while (length.contains(s.charAt(r))) {
                length.remove(s.charAt(l));
                l++;
            }
            length.add(s.charAt(r));
            r++;
            res = Math.max(res, length.size());
        }
        return res;
    }
}
