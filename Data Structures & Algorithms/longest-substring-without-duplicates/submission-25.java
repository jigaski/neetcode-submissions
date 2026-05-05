class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {return 0;}
        int l = 0;
        int r = 0;
        int res = 0;
        Set<Character> string = new HashSet<>();
        while(r < s.length()) {
            while(string.contains(s.charAt(r))) {
                string.remove(s.charAt(l));
                l++;
            }
            string.add(s.charAt(r));
            r++;
            res = Math.max(res, string.size());
        }
        return res;
    }
}
