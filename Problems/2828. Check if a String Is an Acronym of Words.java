// SUSHANT SINHA

// 1ms ( 100% ) 43.5mb ( 88.95% )

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        int len=s.length();
        
        if(words.size()!=len)
            return false;
        
        for(int i=0;i<len;i++){
            
            if(words.get(i).charAt(0)!=s.charAt(i))
                return false;
            
        }
            
        return true;
        
    }
}