// SUSHANT SINHA

class Solution {
    public int[] sumZero(int n) {
        
        if(n==1)return new int[]{0};
        
        int ans[]=new int[n];
        
        for(int i=0;i<n/2;){
            ans[i]=++i;
        }
        for(int i=n-1;i>=n/2;i--){
            ans[i]=-ans[n-i-1];
        }
        
        return ans;
    }
}