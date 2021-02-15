// SUSHANT SINHA

// 5ms ( 22.33% ) 40mb ( 69.06% )

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int ans[]=new int[k];
        int len=0;
        
        for(int i=0;i<=mat[0].length;i++){
            
            for(int j=0;j<mat.length;j++){
                
                if(!Arrays.asList(ans).contains(j)){
                        int count=0;
                    for(int x:mat[j]){
                        if(x==1){
                            count++;
                        }
                    }
                    if(count==i){
                        ans[len++]=j;
                        if(len==k)return ans;
                    }
                }
                
            }
            
        }
        
        return mat[0];
    }
}
