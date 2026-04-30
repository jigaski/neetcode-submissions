class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> builder = new HashMap<>();
        for (String word : strs) {
            char[] charray = word.toCharArray();
            Arrays.sort(charray);
            String sorted = new String(charray);
            if (builder.containsKey(sorted)) {
                builder.get(sorted).add(word);
            } else {
                builder.put(sorted, new ArrayList<>());
                builder.get(sorted).add(word);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (List<String> vals : builder.values()) {
            output.add(vals);
        }
        return output;
    }
}
