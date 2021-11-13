// SUSHANT SINHA

// 6ms ( 60.19% ) 38.6mb ( 81.02% )
// most common answer (everyone uses this 😑)

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        
        int ans=-1,minDiff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                int diff = Math.abs(target-sum);
                if(diff<minDiff){
                    ans=sum;minDiff=diff;
                }
                if(sum>target){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return ans;
    }
}

// best solution from the submissions tab

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int closest = findClosest(nums, i, target);
            if (target == closest) {
                return target;
            }
            if (Math.abs(target-closest) <= Math.abs(target-result)) {
                result = closest;
            }
            while (i < nums.length - 2 && nums[i] == nums[i+1]) {
                i++;
            }
        }
        return result;
    }
    
    private int findClosest(int[] nums, int index, int target) {
        int i = index + 1;
        int j = nums.length - 1;
        int result = nums[index] + nums[i] + nums[j];
        while (i < j) {
            int closest = nums[index] + nums[i] + nums[j];
            if (Math.abs(target-closest) <= Math.abs(target-result)) {
                result = closest;
            }
            if (closest > target) {
                j--;
            }
            else if (closest < target) {
                i++;
            }
            else {
                return target;
            }
        }
        return result;
    }
}