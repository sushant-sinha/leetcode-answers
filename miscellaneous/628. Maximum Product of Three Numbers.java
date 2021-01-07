// SUSHANT SINHA

// fatest solution 1ms

class Solution {
    public int maximumProduct(int[] nums) {
     
        
        /*Arrays.sort(nums);
        return Math.max(
                nums[0]*nums[1]*nums[nums.length-1],
                 nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);*/
        
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        
        
        for(int n : nums)
        {
            if(n < min2)
            {
                if(n < min1)
                {
                    min2 = min1;
                    min1 = n;
                }
                else
                {
                    min2 = n;
                }
            }
            
            if(n > max1)
            {
                if(n > max2)
                {
                    if(n > max3)
                    {
                        max1 = max2;
                        max2 = max3;
                        max3 = n; 
                    }
                    else
                    {
                        max1= max2;
                        max2=n;
                    }
                }
                else
                {
                    max1 = n;
                }
            }

        }
        return Math.max(max1*max2*max3 , min1*min2*max3);
    }
}

// my solution 15ms

class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        
        int temp;
        if( nums[0] < 0 && nums[1] < 0 && nums[nums.length-1] > 0){
            
            temp= nums[0]*nums[1]*nums[nums.length-1];
            if(temp > nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3])
                return temp;
            else return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }
        
        return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }
}