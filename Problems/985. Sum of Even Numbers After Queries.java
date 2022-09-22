class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int sum=0;
        
        int ans[]=new int[queries.length];
        
        for(int i:nums)
            if(i%2==0)
                sum+=i;
        
        
        for(int i=0;i<queries.length;i++){
            
            if(nums[queries[i][1]]%2==0)
            sum-=nums[queries[i][1]];
            
            // System.out.println(i+" "+sum);
            
            nums[queries[i][1]]+=queries[i][0];
            
            if(nums[queries[i][1]]%2==0){
                sum+=nums[queries[i][1]];
                // System.out.println("new num is even "+nums[queries[i][1]]);
                // System.out.println("inside "+sum);
                
            }
            
            ans[i]=sum;
            
        }
        
        
        return ans;
        
    }
}