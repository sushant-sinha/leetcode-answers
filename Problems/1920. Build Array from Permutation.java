// SUSHANT SINHA

// 1ms ( 99.96%) 39.5mb ( 72.66%  )

class Solution {
    public int[] buildArray(int[] nums) {
        
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            ans[i]=nums[nums[i]];
        
        return ans;
        
    }
}

// best solution
// 1ms ( 99.96% ) 52mb ( 6.07% )

class Solution {
    int []  recMeth(int[] retArr, int [] nums, int index ){
        int len  =  nums.length;
        if(index<len){
             retArr[index]  =  nums[nums[index]];
            index++;
          retArr  = recMeth(retArr, nums, index);
        }
        return retArr;
    }
    public int[] buildArray(int[] nums) {
        int len  =  nums.length;
        int [] retArr =  new int[len];
        // for(int i=0;i<len;i++)
        //     {
        //         retArr[i]  =  nums[nums[i]];
        //     }
        retArr = recMeth(retArr, nums, 0);
        return retArr;
    }
}