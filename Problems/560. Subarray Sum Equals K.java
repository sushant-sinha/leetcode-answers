// SUSHANT SINHA

// using the sum of previous elements
// 1307ms( 5.83% ) 42.6mb ( 10.17% )

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int ans=0;
        if(nums[0]==k)
            ans++;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==k)
                ans++;
            
            nums[i]+=nums[i-1];
            if(nums[i]==k)
                ans++;
        }
        
        for(int i=1;i<nums.length-1;i++){
            
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[j]-nums[i-1]==k)
                    ans++;
                
            }
            
        }
        
        return ans;
        
    }
}

// using hashmap from submitted solutions
// 18ms ( 67.49% ) 41mb ( 89.61% )

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i<nums.length; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum - k)) {
                count+=map.get(sum -k);
            }
            map.put(sum, map.getOrDefault(sum ,0) + 1);
        }
        return count;
    }
}