class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        Map<Character, Character> parenMap = new HashMap<>();
        parenMap.put(')', '(');
        parenMap.put('}', '{');
        parenMap.put(']', '[');
        Stack<Character> parens = new Stack<>();                               
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if (parens.empty()) {
                    return false;
                }
                char open = parens.pop();
                if (parenMap.get(s.charAt(i)) != open) {
                    return false;
                }
            } else {
                parens.push(s.charAt(i));
            }
        }
        if (parens.size() > 0) {
            return false;
        }
        return true;
    }
}
