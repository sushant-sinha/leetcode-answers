// SUSHANT SINHA

// 0ms ( 100% ) 38.6mb ( 47.85% )

class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int ans[]=new int[k];
        
        int index=0;
        int val=0;
        int arind=0;
        
        while(index!=k){
            
            while(arind<arr.length && val+1==arr[arind]){
                val++;
                arind++;
            }
            
            ans[index++]=++val;
            
        }
        
        return ans[--k];        
        
    }
}