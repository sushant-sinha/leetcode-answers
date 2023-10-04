// SUSHANT SINHA

// 1ms ( 100% ) 40.5mb ( 92.61% )

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        int ans=0;
        
        HashSet<Integer> set= new HashSet<>();
        
        for(int i=1;i<=k;i++)
            set.add(i);
        
        for(int i=nums.size()-1; i>=0; i--){
            
            if(set.size()==0){
                
                return ans;
                
            }
            
            else{
                set.remove(nums.get(i));
                ans++;
            }
            
        }
        
        return ans;
        
    }
}