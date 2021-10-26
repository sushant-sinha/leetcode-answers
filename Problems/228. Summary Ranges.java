// SUSHANT SINHA

// optimized string concatenation solution
// 0ms ( 100% ) 37mb ( 97.98% )

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            int start=nums[i];
            
            //ans.add(""+start);
            
            StringBuilder s=new StringBuilder();
            
            int counter=0;
            
            while(i+counter+1<nums.length && nums[i+counter+1]==start+counter+1){
                
                counter++;
                continue;
                
            }
            
            //System.out.println(start);
            
            if(counter!=0){
                s.append(start);s.append("->");s.append(nums[i+counter]);
                ans.add(s.toString());
            }
            
            else{
                ans.add(s.append(start).toString());
            }
            
            i+=counter;
            
        }
        
        return ans;
        
    }
}

// original solution
/*
    IMPORTANT
    
    using + to concatenate string is the solwest method

    USING StringBuilder's append method is the fastest

*/
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