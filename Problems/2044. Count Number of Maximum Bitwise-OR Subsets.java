// used for testing coderabbitai performance on PRs

// 6ms ( 95.80% ) 40.82mb ( 74.16% )


class Solution {

    int maxBitwiseOR, ans=0;

    public int countMaxOrSubsets(int[] nums) {

        maxBitwiseOR=findMax(nums);

        recur(nums, 0, 0);

        return ans;
    }

    int findMax(int[] ar){

        int ans=0;

        for(int i: ar)
            ans|=i;

        return ans;
    }

    void recur(int nums[], int index, int curOR){

        for(; index < nums.length; index++){


        // System.out.println("in for "+index);

            

            for(;index<nums.length;index++){

            // System.out.println("----------- in for "+index);

                int tempOR=curOR | nums[index];

                if(tempOR==maxBitwiseOR)
                    ans++;

                recur(nums, index+1, tempOR);
            }

        // System.out.println("--------------------end for "+x);

            return;
        }

    }
}