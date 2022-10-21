// SUSHANT SINHA

// 10ms ( 40.00% ) 52mb ( 40.00% )

class Solution {
    public int findMaxK(int[] nums) {
        
        HashSet<Integer> seen=new HashSet<>();
        
        int ans=-1;
        
        for(int i:nums){
            
            if(seen.contains((-1*i))){
                
                ans=Math.abs(i)>ans ? Math.abs(i) : ans;
                
            }
            
            else
                seen.add(i);
        }
        
        return ans;
        
    }
}