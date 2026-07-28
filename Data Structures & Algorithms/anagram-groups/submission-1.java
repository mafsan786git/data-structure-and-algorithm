class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();

        for(String s : strs){
            String hash = createHash(s);
            res.putIfAbsent(hash,new ArrayList<>());
            res.get(hash).add(s);
        }

        return new ArrayList<>(res.values());

    }

    public String createHash(String str){
        int[] count = new int[26];

        for(char c : str.toCharArray()){
            count[c-'a']++;
        }
        return Arrays.toString(count);
    }
}
