// SUSHANT SINHA

// 95ms ( 20% ) 106.7mb ( 20% )

class Solution {
    public long countBadPairs(int[] nums) {
        
        long ans=0, n=nums.length;

        // ans counts the numbers which are good
        // rearrange the condition to be --> nums[j]-j == nums[i]-i
        
        // mapping values and their counts
        HashMap<Integer, Integer> counter=new HashMap<>();
        
        // both are fine
        // for(int i=0; i<nums.length;i++)

        for(int i=nums.length-1;i>=0;i--){
            
            int diff=nums[i]-i;
            
            //System.out.println(diff);
            
            if(counter.containsKey(diff))
                ans+=counter.get(diff);
            
            if(counter.containsKey(diff))
                counter.put(diff, counter.get(diff)+1);
            
            else
                counter.put(diff, 1);
            
            
        }
        
        // instead of calculating fact(n)and fact(n-2)...
        // used n*(n-1)
        // this was for calculating all the possible pairs

        return (n*(n-1)/2)-ans;
        
    }
}