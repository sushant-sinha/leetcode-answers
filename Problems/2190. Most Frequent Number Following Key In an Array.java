// SUSHANT SINHA

// 2ms ( 100% ) 42.1mb ( 100% )

class Solution {
    public int mostFrequent(int[] nums, int key) {
        
        int ans=0;
        
        HashMap<Integer, Integer> counter=new HashMap<>();
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==key){
                
                if(counter.containsKey(nums[i+1])){
                    counter.put(nums[i+1],counter.get(nums[i+1])+1);
                }
                
                else{
                    counter.put(nums[i+1],1);
                }
            }
            
        }
        
        int min=0;
        
        // code for traversing the HashMap: https://www.geeksforgeeks.org/iterate-map-java/
        for(Map.Entry<Integer, Integer> m: counter.entrySet()){
            if(m.getValue()>min){
                min=m.getValue();
                ans=m.getKey();
            }
        }
        
        return ans;
        
    }
}
