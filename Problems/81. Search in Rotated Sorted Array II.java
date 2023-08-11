class Solution {
    public boolean search(int[] nums, int target) {

        if(nums.length==1){
            if(nums[0]==target)
                return true;
            else
                return false;
        }

        // find the starting point of the array

        int start=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                start=i;
                break;
            }
        }

        // start binary search for the broken two sets

        // both start and end are inclusive ranges for the function helper
        // from [0 - start]
        int index=helper(0, start, nums, target);

        if(index>-1)
            return true;

        // from [start+1 - end]
        index=helper(start+1, nums.length-1, nums, target);

        if(index>-1)
            return true;
        
        return false;
        
    }

    int helper(int start, int end, int[] nums, int target){

        if(nums[start]==target){
            return start;
        }

        if(end-start==1){
            if(nums[start]==target)
                return start;

            if(nums[end]==target)
                return end;

            else 
                return -1;
        }

        int mid=(start+end)/2;
        int ans=-1;

        if(nums[mid]>=target && nums[start]<=target){
            ans=helper(start, mid, nums, target);
        }

        else if(nums[mid]<target && nums[end]>=target){
            ans=helper(mid+1, end, nums, target);
        }

        return ans;

    }
}