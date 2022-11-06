// SUSHANT SINHA

// 29ms ( 23.68% ) 68.6mb ( 6.49% )

// the question expects the solution to run in O(n) time and uses constant extra space.


class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> seen=new HashSet<>();
        
        /*
        Arrays.sort(nums);
        
        boolean end=false, hasone=false;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>0){
                
                if(i==1)
                
            }
        }
        
        return ;
        */
        
        int min=0, max=Integer.MIN_VALUE;
        
        for(int i:nums){
            
            if(i>0){
                
                if(i<min)
                    min=i;
                
                if(i>max)
                    max=i;
                
            }
            
            seen.add(i);
        }
        
        if(min>1 || max<1)
            return 1;
        
        
        for(int i=min+1;i<max;i++){
            
            if(!seen.contains(i)){
                return i;
            }
            
        }
        
        return max+1;
        
    }
}