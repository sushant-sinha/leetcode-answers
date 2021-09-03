// SUSHANT SINHA

// 2ms ( 99.19% ) 38.6mb ( 81.07% )

class Solution {
    public boolean makeEqual(String[] words) {
        
        int count[]=new int[26];
        
        for(String s:words){
            
            for(char c:s.toCharArray())
                count[c-'a']++;
            
        }
        
        for(int i=0;i<count.length;i++){
            
            if(count[i]!=0){
                if(count[i]%words.length!=0)
                    return false;
            }
            
        }
        
        return true;
        
        
    }
}