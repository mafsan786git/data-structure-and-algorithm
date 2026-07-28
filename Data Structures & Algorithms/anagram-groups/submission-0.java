class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            map.putIfAbsent(sortedStr,new ArrayList<>());
            map.get(sortedStr).add(s);
        }

        return new ArrayList<>(map.values());
    }

}