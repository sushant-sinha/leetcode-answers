class Solution {
    public int countGoodSubstrings(String s) {
        
        int ans=0;
        
        for(int i=0;i<=s.length()-3;i++){
            
            char ar[]=s.substring(i,i+3).toCharArray();
            
            if(ar[0]==ar[1] || ar[1]==ar[2] || ar[0]==ar[2])
                continue;
            else
                ans++;
            
        }
        
        return ans;
        
    }
}