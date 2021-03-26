// SUSHANT SINHA

// 3ms ( 23.60% ) 39.3mb ( 43.15% )

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

class Solution {
    public String restoreString(String s, int[] indices) {
        
        char ans[]= new char[indices.length];
        
        for( int i=0; i< indices.length; i++){
            
            ans[indices[i]]=s.charAt(i);
            
        }
        
        return String.valueOf(ans);
        
    }
}