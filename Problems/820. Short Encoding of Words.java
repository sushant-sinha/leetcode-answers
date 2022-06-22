// SUSHANT SINHA


// trie solution ( also the expected solution )
// from leetcode's solution tab *to do*

class Solution {
    public int minimumLengthEncoding(String[] words) {
        TrieNode trie = new TrieNode();
        Map<TrieNode, Integer> nodes = new HashMap();

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            TrieNode cur = trie;
            for (int j = word.length() - 1; j >= 0; --j)
                cur = cur.get(word.charAt(j));
            nodes.put(cur, i);
        }

        int ans = 0;
        for (TrieNode node: nodes.keySet()) {
            if (node.count == 0)
                ans += words[nodes.get(node)].length() + 1;
        }
        return ans;

    }
}

class TrieNode {
    TrieNode[] children;
    int count;
    TrieNode() {
        children = new TrieNode[26];
        count = 0;
    }
    public TrieNode get(char c) {
        if (children[c-'a'] == null) {
            children[c-'a'] = new TrieNode();
            count++;
        }
        return children[c - 'a'];
    }
}

// initial approach
// this will be followed by the trie approach (optimal ig)... it has better speed at the cost of space

// 540ms ( 9.82ms ) 42.2mb ( 98.77% )
// slow because String is being used for the condition and sorting

class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        
        int len=0;
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            
            boolean found=false;
            
            for(int j=0;j<ans.size();j++){
                
                if( ans.get(j).lastIndexOf(words[i])>=0 && (ans.get(j).lastIndexOf(words[i])+(words[i].length()))==ans.get(j).length()){
                    
                    found=true;
                    //System.out.println("found");
                    break;
                    
                }
            }
            
            if(!found){
                ans.add(words[i]);
                len+=words[i].length()+1;
            }
            
        }
        
        return len;
        
    }
}