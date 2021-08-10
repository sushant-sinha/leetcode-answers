// SUSHANT SINHA

// 1ms ( 66.67% ) 38.9mb ( 66.67% )
// best solution in submission tab was wrong

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        String t="";
        int i=0;
        
        while(t.length()<s.length() && i<words.length){
            t+=words[i++];
            
            if(t.equals(s))
                return true;
        }
        
        return false;
        
    }
}