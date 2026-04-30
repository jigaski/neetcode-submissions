class Solution {
    public boolean isPalindrome(String s) {
        String s_clean = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int strlen = s_clean.length();
        int endptr = strlen - 1;
        for (int i = 0; i < strlen; i++) {
            if (s_clean.charAt(i) == s_clean.charAt(endptr)) {
                endptr--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
