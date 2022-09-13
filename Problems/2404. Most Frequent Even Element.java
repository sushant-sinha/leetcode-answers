class Solution {
    public int mostFrequentEven(int[] nums) {
        
        int ans=-1, n=nums.length, max=0;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            
            int counter=1;
            
            if(nums[i]%2==0){
                
                int temp=nums[i];
                
                i++;
                
                while(i<n && nums[i]%2==0){
                    
                    if(nums[i]!=temp){
                        i--;
                        break;
                    }
                    
                    counter++;
                    i++;
                    
                }
                
                //System.out.println(counter);
                
                ans = counter>max ? temp : ans;
                max=max>counter ? max : counter;
                
            }
            
        }
        
        return ans;
        
    }
}