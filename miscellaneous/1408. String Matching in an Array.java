// SUSHANT SINHA

// 10ms ( 10.80% ) 39.5mb ( 14.77% )

class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<words.length-1;i++){
            
            for(int j=i+1;j<words.length;j++){
                
                String small=words[i].length()>=words[j].length() ? words[j] : words[i];
                String big=words[i].length()<words[j].length() ? words[j] : words[i];
                                
                if(issub(small,big)){
                    if(!ans.contains(small))
                    ans.add(small);
                    
                }
                
            }
            
            
        }
        
        return ans;
        
    }
    
    public boolean issub(String small, String big){
        
        for(int i=0;i<big.length()-small.length()+1;i++){
            if(small.equals(big.substring(i,i+small.length())))
                return true;
        }
        
        return false;
    }
}