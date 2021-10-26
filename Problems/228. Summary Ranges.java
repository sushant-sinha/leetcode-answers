// SUSHANT SINHA

// 6ms ( 77.45% ) 37.8mb ( 51.36% )

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            int start=nums[i];
            
            //ans.add(""+start);
            
            int counter=0;
            
            while(i+counter+1<nums.length && nums[i+counter+1]==start+counter+1){
                
                counter++;
                continue;
                
            }
            
            //System.out.println(start);
            
            if(counter!=0){
                ans.add(start+"->"+nums[i+counter]);
            }
            
            else{
                ans.add(""+start);
            }
            
            i+=counter;
            
        }
        
        return ans;
        
    }
}