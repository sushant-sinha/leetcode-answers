// SUSHANT SINHA

// 1ms ( 100.00% ) 45.46mb ( 50.47% )

class Solution {
    public int[] resultsArray(int[] nums, int k) {

        // if the array has only one element or when the window size is of 1
        if(nums.length==1 || k==1)
            return nums;

        // lastFalseIndex is used to remember the lastIndex which failed our consecutive ascending order condition
        int lastFalseIndex=-1, n=nums.length;

        int start=0, end=1;

        int ans[]=new int[n-k+1];

        while(end<n){

            // increment the start pointer if the window is smaller than k
            if(end-start>k-1){
                start++;
            }

            // if we have move ahead of that pair of numbers which failed our conditio, we can reset this index
            if(start>=lastFalseIndex){
                lastFalseIndex=-1;
            }

            // if the current pair is not consecutive increasing, we will set lastFalseIndex to be the current index
            if(nums[end]-nums[end-1]!=1)
                lastFalseIndex=end;

            // if the window is of size k and it contains that pair which failed our condition, we will set answer to -1 and continue
            // if(lastFalseIndex>start && end-start==k-1){
            //     ans[end-k+1]=-1;
            //     end++;
            //     continue;
            // }

            // if the windowsize is correct and we skipped the above condition (because we don't have a bad value yet)
            if(end-start==k-1){

                if(lastFalseIndex>start){
                    ans[end-k+1]=-1;
                }
                else
                    ans[end-k+1]=nums[end];

            }

            end++;
        }

        return ans;
        
    }
}