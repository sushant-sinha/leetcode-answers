// SUSHANT SINHA

// using predefined sum of all previous+current_element
// 6ms ( 100% ) 41.6mb ( 87.58% )

class NumArray {
    
    int cursum[];

    public NumArray(int[] nums) {
        
        cursum=new int[nums.length];
        
        // initializing 0th index of sum array
        cursum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            cursum[i]=cursum[i-1]+nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        
        if(left!=0)
            return cursum[right]-cursum[left-1];
        
        else return cursum[right];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

// no brain answer
// 79ms ( 5.11% ) 41.9mb ( 51.58% )

class NumArray {
    
    int ar[];

    public NumArray(int[] nums) {
        
        ar=new int[nums.length];
        
        ar=nums;
        
    }
    
    public int sumRange(int left, int right) {
        
        int ans=0;
        
        while(left!=right+1){
            ans+=ar[left++];
        }
        
        return ans;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */