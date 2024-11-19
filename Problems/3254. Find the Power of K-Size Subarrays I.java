class Solution {
    public int[] resultsArray(int[] nums, int k) {

        if(nums.length==1 || k==1)
            return nums;

        int lastFalseIndex=-1, n=nums.length;

        int start=0, end=1;

        int ans[]=new int[n-k+1];

        while(end<n){

            // increment the start pointer 
            if(end-start>k-1){
                start++;
            }

            if(start>=lastFalseIndex){
                lastFalseIndex=-1;
            }

            if(nums[end]-nums[end-1]!=1)
                lastFalseIndex=end;

            if(lastFalseIndex>start && end-start==k-1){
                ans[end-k+1]=-1;
                end++;
                continue;
            }

            

            if(end-start==k-1){

                if(nums[end]-nums[end-1]==1)
                    ans[end-k+1]=nums[end];

                else{
                    ans[end-k+1]=-1;
                }
            }

            end++;
        }

        return ans;
        
    }
}