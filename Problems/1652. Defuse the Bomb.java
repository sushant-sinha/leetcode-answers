// SUSHANT SINHA

// 1ms ( 70.10% ) 39mb ( 68.84% )

class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int ans[]=new int[code.length];
        
        if(k==0){
            for(int i=0;i<code.length;i++)
                ans[i]=0;
        }
        
        else if(k>0){
            for(int i=0;i<code.length;i++){
                for(int j=i+1;j<=i+k;j++){
                    ans[i]+=code[j%code.length];
                }
            }
        }
        
        else{
            for(int i=0;i<code.length;i++){
                int x=k;
                for(int j=i-1;x!=0;j--,x++){
                    if(j<0)
                        ans[i]+=code[code.length+j];
                    else
                        ans[i]+=code[j];
                }
            }
        }
        
        return ans;
        
    }
}