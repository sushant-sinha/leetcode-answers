class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int count[]=new int[26];
        
        for(char c:s.toCharArray()){
            
            count[c-'a']++;
            
        }
        
        int tar[]=new int[26];
        
        for(char c:target.toCharArray()){
            
            tar[c-'a']++;
            
        }
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<26;i++){
            
            if(tar[i]>0 && count[i]<tar[i])
                return 0;
            
            else if(tar[i]>0 && count[i]>=tar[i]){
                
                int factor=count[i]/tar[i];
                ans=Math.min(ans,factor);
                
            }
            
        }
        
        return ans;
        
    }
}