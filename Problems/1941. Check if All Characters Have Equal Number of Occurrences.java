// SUSHANT SINHA

// 2ms ( 71.95% ) 39.1mb ( 32.48% )

class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int ar[]=new int[26];
        
        for(char c:s.toCharArray()){
            ar[c-'a']++;
        }
        
        int a=0,i=0;
        
        for(;i<26;i++){
            
            if(ar[i]!=0){
                a=ar[i];
                break;
            }
            
        }
        
        for(;i<26;i++){
            
            if(ar[i]!=0 && ar[i]!=a)
                return false;
            
        }
        
        return true;
        
    }
}