// SUSHANT SINHA

// basic approach 😑
// 1234 ms ( 5.03% ) 39.5mb ( 60.92% )

class Solution {
    public String longestWord(String[] words) {
        
        String ans="";
        
        ArrayList<String> ar=new ArrayList<>();
        
        for(String s:words)
            ar.add(s);
        
        // array is faster than arraylist
        
        for(String test:words){
            
            boolean isans=true;
            
            for(int i=1;i<test.length();i++){
                
                if(!ar.contains(test.substring(0,i)))
                    isans=false;
                
            }
            
            if(isans){
                
                if(ans.length()==test.length())
                    ans= ans.compareTo(test)>0 ? test : ans;
                
                else
                    ans=ans.length()<test.length() ? test : ans;
                
                
            }
            
            
        }
        
        return ans;
        
    }
}

// using trie ( expected/best solution from submission tab)
// 11ms ( 81.23% ) 49.9mb (  )

class Solution {
    class TrieNode{
        TrieNode[] children;
        String word;
        public TrieNode(){
            this.children = new TrieNode[26]; 
        }
    }
    TrieNode root;
    public void insert(String word){
        TrieNode curr = root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(curr.children[c-'a']==null){
                curr.children[c-'a'] = new TrieNode();
            }
            curr = curr.children[c-'a'];
        }
        curr.word = word;
    }
    String result;
    public String longestWord(String[] words) {
        root = new TrieNode();
        for(String word : words){
            insert(word);
        }
        result = "";
       dfs(root);
        return result;
    }
    public void dfs(TrieNode curr){
        //base
        if(curr.word!=null && curr.word.length()>=result.length()){
            result = curr.word;
        }
        //action
        for(int i=25;i>=0;i--){
            if(curr.children[i]!=null && curr.children[i].word !=null){
                dfs(curr.children[i]);
            }
        }
    }
}