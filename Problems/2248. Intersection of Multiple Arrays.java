// SUSHANT SINHA

// 2ms ( 99.36% ) 42.3mb ( 98.92% )

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