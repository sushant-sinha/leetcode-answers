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