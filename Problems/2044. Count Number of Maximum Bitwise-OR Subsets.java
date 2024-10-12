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

        if(index==nums.length){
            return;
        }

        int x=index;

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