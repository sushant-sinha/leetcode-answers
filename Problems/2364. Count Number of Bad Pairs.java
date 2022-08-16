class Solution {
    public long countBadPairs(int[] nums) {
        
        long ans=0, n=nums.length;
        
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

        return (n*(n-1)/2)-ans;
        
    }
}