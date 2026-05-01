class Solution {
    private List<Integer> sizes = new ArrayList<>();
    private int sizeIndex = 0;
    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            char[] charray = strs.get(i).toCharArray();
            for (int j = 0; j < charray.length; j++) {
                builder.append(charray[j]);
            }
            if (i != strs.size() - 1) {
                builder.append(' ');
                sizes.add(charray.length + 1);
            } else {
                sizes.add(charray.length);
            }    
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        if (str == "") {
            return strs;
        }
        char[] charray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        int strsize = 0;
        for (int i = 0; i < charray.length; i++) {
            strsize++;
            if (charray[i] == (' ') && strsize == sizes.get(sizeIndex)) {
                String fragment = builder.toString();
                strs.add(fragment);
                builder.setLength(0);
                sizeIndex++;
                strsize = 0;
                continue;
            }
            builder.append(charray[i]);
        }
        String fragment = builder.toString();
        strs.add(fragment);
        return strs;
    }
}
