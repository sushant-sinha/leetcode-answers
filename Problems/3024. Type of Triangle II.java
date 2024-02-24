// SUSHANT SINHA

// 1ms ( 61.69% ) 41.80mb ( 83.92% )

class Solution {
    public String triangleType(int[] nums) {
        
        if(!isValidTriangle(nums))
            return "none";
        
        if(nums[0]==nums[   1] && nums[1]==nums[2])
                return "equilateral";
        
        if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0])
            return "isosceles";
        
        else
            return "scalene";
        
    }
    
    boolean isValidTriangle(int ar[]){
        
        boolean flag=true;
        
        flag = flag && (ar[0]+ar[1]>ar[2]);
        flag = flag && (ar[1]+ar[2]>ar[0]);
        flag = flag && (ar[0]+ar[2]>ar[1]);
        
        flag = flag && (Math.abs(ar[0]-ar[1])<ar[2]);
        flag = flag && (Math.abs(ar[1]-ar[2])<ar[0]);
        flag = flag && (Math.abs(ar[0]-ar[2])<ar[1]);
        
        return flag;
        
    }
}