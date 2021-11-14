// SUSHANT SINHA

// 0ms ( 100% ) 37.2mb ( 100% )

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        // for storing the frequency of the characters per word
        int fr[]=new int[26];
        
        for(char c:word1.toCharArray())
            fr[c-'a']++;
        
        for(char c:word2.toCharArray())
            fr[c-'a']--;
        
        for(int i:fr)
            if(i<-3 || i>3)
                return false;
        
        return true;
        
    }
}