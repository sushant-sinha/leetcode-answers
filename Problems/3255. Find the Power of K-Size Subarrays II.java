/*

    initally came up with this solution
    it fails for the case [1,7,8], k=2
    [7,8] seems to be correct
    the reason is: the question says all the elements are "consecutive"
    1,7 are not

*/
class Solution {

    int ans[];
    public int[] resultsArray(int[] nums, int k) {

        if(k==1)
            return nums;

        ans=new int[nums.length-k+1];

        // helper(input array, start index, window size, array length, isSorted)
        helper(nums, 0, k, nums.length, false);

        return ans;
        
    }

    void helper(int ar[], int i, int k, int len, boolean isSorted){

        if(i+k-1==len)
            return;

        if(isSorted){
            if(ar[i+k-1]>ar[i+k-2]){
                ans[i]=ar[i+k-1];
                helper(ar, i+1, k, len, true);
            }

            else{
                ans[i]=-1;
                helper(ar, i+1, k, len, false);
            }
        }

        else{
            // check if it is sorted
            for(int index=i; index<i+k-1; index++){
                
                // if not sorted
                if(ar[index]>=ar[index+1]){
                    ans[i]=-1;
                    helper(ar, i+1, k, len, false);
                    return;
                }
            }

            // if sorted

            ans[i]=ar[i+k-1];
            helper(ar, i+1, k, len, true);

        }
    }
}