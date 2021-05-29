// solution by hiepit 

// https://leetcode.com/problems/maximum-erasure-value/discuss/1235666/pythonjavac-sliding-window-hashmap-clean-concise-on

// 41ms ( 80.29% ) 51,4mb ( 85.68% )

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        Map<Integer, Integer> seen = new HashMap<>(); // mapping of number,index
        
        int l = 0, sum = 0, ans = 0;
        
        for (int r = 0; r < nums.length; r++) {
            int x = nums[r];
            if (seen.containsKey(x)) {
                int index = seen.get(x);
                
                while (l <= index) {
                    // removing the elements that we travesed just now
                    seen.remove(nums[l]);
                    
                    sum -= nums[l];
                    l += 1;
                    
                }
            }
            
            // add the unseen integer with its index
            seen.put(x, r);
            
            sum += x;
            ans = ans > sum ? ans : sum;
        }
        return ans;
    }
}