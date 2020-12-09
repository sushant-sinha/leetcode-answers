// SUSHANT SINHA

class Solution {
    public int tribonacci(int n) {
        
        int [] ans=new int[4];
        ans[0]=0;
        ans[1]=1;
        ans[2]=1;
        ans[3]=2;
        
        if(n<4)return ans[n];
        
        for(int i=4;i<=n;i++){
            
            ans[0]=ans[3]+ans[2]+ans[1];
            
            ans[1]=ans[2];
            ans[2]=ans[3];
            ans[3]=ans[0];
        }
        return ans[0];
    }
}