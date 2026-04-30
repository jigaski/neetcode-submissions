class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> builder = new HashMap<>();
        Set<String> strSet = new HashSet<>();
        List<List<String>> groups = new ArrayList<>();
        for (String word : strs) {
            char[] charray = word.toCharArray();
            Arrays.sort(charray);
            String sorted = new String(charray);
            if (strSet.contains(sorted)) {
                builder.get(sorted).add(word);
            } else {
                builder.put(sorted, new ArrayList<>());
                builder.get(sorted).add(word);
                strSet.add(sorted);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (List<String> vals : builder.values()) {
            output.add(vals);
        }
        return output;
    }
}
