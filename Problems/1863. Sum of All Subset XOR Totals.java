// 0ms ( 100% ) 36.3mb ( 70% )

class Solution {
    
    int ans=0;
    
    public int subsetXORSum(int[] nums) {
        
        XOR(nums,0,0);
        return ans;
        
    }
    
    void XOR(int temp[], int a, int sum){
        
        ans+=sum;
        
        for(int i=a;i<temp.length;i++)            
            XOR(temp, i+1, sum^temp[i]);
        
    }
    
}
