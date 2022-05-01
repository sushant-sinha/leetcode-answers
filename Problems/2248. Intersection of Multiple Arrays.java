class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        int counter[]=new int[1001];
        
        for(int i[]:nums){
            
            for(int j:i)
                counter[j]++;
            
        }
        
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<counter.length;i++){
            
            if(counter[i]==nums.length)
                ans.add(i);
            
        }
        
        return ans;
        
    }
}