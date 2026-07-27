class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        int minIndex = 0;
        int prefixLength = strs[0].length();
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < prefixLength){
                minIndex = i;
                prefixLength = strs[i].length();
            }
        }

        Trie trie = new Trie();
        trie.insert(strs[minIndex]);

        for(String str : strs){
            prefixLength = trie.lcp(str,prefixLength);
        }

        return strs[0].substring(0,prefixLength);
        
    }
}

class TreeNode {
    TreeNode[] child = new TreeNode[26];
}

class Trie{
    TreeNode root = new TreeNode();

    public void insert(String str){
        TreeNode node = root;
        for(char c : str.toCharArray()){
            int index = c -'a';
            if(node.child[index] == null){
                node.child[index] = new TreeNode();
            }
            node = node.child[index];
        }
    }

    public int lcp(String str,int prefixLength){
        TreeNode node = root;
        int i = 0;
        while(i < Math.min(str.length(),prefixLength)){
            int index = str.charAt(i) - 'a';
            if(node.child[index] == null) return i;

            node = node.child[index];
            i++;
        }

        return Math.min(prefixLength,i);

    }
}