// SUSHANT SINHA

// 1ms ( 87.95% ) 36.7mb ( 95.53% )

class Solution {
    public int compareVersion(String version1, String version2) {
        
        String s1[]=version1.split("\\.");
        String s2[]=version2.split("\\.");
        
        int ans=0;
        
        if(s1.length==s2.length){
            
            for(int i=0;i<s1.length;i++){
                                
                if(Integer.parseInt(s1[i]) > Integer.parseInt(s2[i]))
                    return 1;
                if(Integer.parseInt(s1[i]) < Integer.parseInt(s2[i]))
                    return -1;
                
            }
            
            return ans;
            
        }
        
        
        else{
            
            if(s1.length>s2.length)
                ans=check(s1,s2);
            
            else{
                ans=check(s2,s1);
                if(ans==1)return -1;
                if(ans==-1)return 1;
                else return ans;
            }
            
        }
        
        return ans;
    }
    
    public int check(String s1[], String s2[]){
        
        int ans=0;
        
        for(int i=0;i<s1.length;i++){
            
            if(i>=s2.length){
                if(Integer.parseInt(s1[i])>0)
                    return 1;
            }
            
            else{
                if(Integer.parseInt(s1[i]) > Integer.parseInt(s2[i]))
                    return 1;
                if(Integer.parseInt(s1[i]) < Integer.parseInt(s2[i]))
                    return -1;
            }
            
        }
        
        return ans;
        
    }
}