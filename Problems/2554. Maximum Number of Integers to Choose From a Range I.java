class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        int ans=0, sum=0;
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i: banned)
            set.add(i);
        
        for(int i=1;i<=n && sum<=maxSum;i++){
            
            if(set.contains(i))
                continue;
            
            if(sum+i<=maxSum){
                sum+=i;
                ans++;
            }
        }
        
        return ans;
        
    }
}