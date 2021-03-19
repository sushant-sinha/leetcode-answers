// SUSHANT SINHA

// 0ms ( 100% ) 36.7mb ( 83.31% )

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String sub[]=sentence.split(" ");
        
        for(int i=0;i<sub.length;i++){
            
            if( sub[i].length()>=searchWord.length() && sub[i].substring(0,searchWord.length()).equals(searchWord) )
                return ++i;
        
        }
        
        return -1;
        
    }
}