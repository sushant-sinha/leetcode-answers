// SUSHANT SINHA

// expected solution
// 14ms ( 93.78% ) 55.5mb ( 53.14% )

class Solution {
     public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int remainder = 0;
        for (int i = 0; i < nums.length; i++) {
            remainder = (nums[i] + remainder) % k;
            if (map.containsKey(remainder)) {
                Integer prev = map.get(remainder);
                if (i - prev > 1) return true;
            } else {
                map.put(remainder, i);
            }
        }
        
        return false;
    }
}

// brute force....can pass 93/94 test cases
// the only failed testcase had nums.length=10^5

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            if(nums[i]%k==0)
                return true;
        }
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+2;j<nums.length;j++){
                if((nums[j]-nums[i])%k==0)
                    return true;
            }
        }
        
        return false;
        
    }
}