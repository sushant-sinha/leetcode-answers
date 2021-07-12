// SUSHANT SINHA

// 16ms ( 27.37% ) 44.2mb ( 100% )

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
                i++;
            }
            
        }
        
        System.gc();
        
        return ans;
        
    }
}

// 3ms ( 100% ) 44.6mb ( 100% )

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        
        int freq[]=new int[nums.length+1];
        
        for(int i:nums)
            freq[i]++;
        
        for(int i=0;i<freq.length;i++)
            if(freq[i]==2)
                ans.add(i);
            
        System.gc();
        
        return ans;
        
    }
}