// SUSHANT SINHA

// 5ms ( 24.09% ) 38.7mb ( 59.60% )

class Solution {
    public String truncateSentence(String s, int k) {
        
        String ans="";
        String split[]=s.split(" ");
        
        for(int i=0;i<k-1;i++){
            
            ans+=split[i]+" ";
            
        }
        
        ans+=split[k-1];
        
        return ans;
        
    }
}