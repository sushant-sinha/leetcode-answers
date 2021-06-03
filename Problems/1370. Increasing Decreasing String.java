// SUSHANT SINHA

// 3ms ( 65.94% ) 40.5mb ( 5.02% )

class Solution {
    public String sortString(String s) {
        
        int total=s.length();
        int ar[]=new int[26];
        
        StringBuffer ans=new StringBuffer();
        
        for(char c:s.toCharArray()){
            ar[c-'a']++;
        }
        
        while(total!=0){
            
            for(int i=0;i<26;i++){
                if(ar[i]!=0){
                    ans.append((char)('a'+i));
                    ar[i]--;
                    total--;
                }
                if(total==0)
                    break;
            }
            
            if(total==0)
                break;
            
            for(int i=25;i>=0;i--){
                if(ar[i]!=0){
                    ans.append((char)('a'+i));
                    ar[i]--;
                    total--;
                }
                if(total==0)
                    break;
            }
        }
        
        return ans.toString();
        
    }
}