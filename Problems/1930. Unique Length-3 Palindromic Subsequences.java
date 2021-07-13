class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int ans=0;
        int full[]=new int[26];
        
        for(int i=0;i<s.length()-2;i++){
            if(full[s.charAt(i)-'a']==1){
                continue;
            }
            
            int j=s.length()-1;
            for(;j>i+1;j--){
                
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                
            }
            
            ans+=s.substring(i+1,j).chars().distinct().count();
            
            full[s.charAt(i)-'a']=1;
            
            if(ans==676)
                return 676;
            
        }
        
        return ans;
        
    }
}