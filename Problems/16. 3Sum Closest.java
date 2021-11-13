// SUSHANT SINHA

// 6ms ( 60.19% ) 38.6mb ( 81.02% )
// most common answer (everyone uses this 😑)

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        
        int ans=-1,minDiff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                int diff = Math.abs(target-sum);
                if(diff<minDiff){
                    ans=sum;minDiff=diff;
                }
                if(sum>target){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return ans;
    }
}