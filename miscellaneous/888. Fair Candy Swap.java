// SUSHANT SINHA

// TLE ( worked fine for small arrays )

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int ans[]=new int[2];
        
        int sum=0;
        
        for(int x:A)sum+=x;
        for(int x:B)sum+=x;
        
        sum/=2;
                
        for(int i=0;i<A.length;i++){
            
            for(int j=0;j<B.length;j++){
                
                int temp=A[i];
                
                for(int k=0;k<B.length;k++){
                    if(k==j)continue;
                    else temp+=B[k];
                }
                
                ans[0]=A[i];ans[1]=B[j];
                
                if(temp==sum)return ans;
                
            }
            
        }
        
        return ans;
        
    }
}
