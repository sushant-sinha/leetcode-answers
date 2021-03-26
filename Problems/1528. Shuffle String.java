// SUSHANT SINHA

class Solution {
    public String restoreString(String s, int[] indices) {
        
        String ans="";
        
        for( int i=0; i< indices.length; i++){
            int j=0;
            
            for(;j<indices.length;j++){
                
                if(indices[j]==i)break;
            }
            
            ans+=s.substring(j,j+1);
            
        }
        
        return ans;
        
    }
}