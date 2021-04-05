// SUSHANT SINHA

// 1ms ( 21.07% ) 36.3mb ( 81.64% )

class Solution {
    public boolean check(int[] nums) {
                
        int sorted[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            sorted[i]=nums[i];
        
        Arrays.sort(sorted);
        
        for(int i=0;i<nums.length;i++){
            
            int first=nums[0];
            
            for(int j=0;j<nums.length-1;j++){
                
                nums[j]=nums[j+1];
                
            }
            
            nums[nums.length-1]=first;
            
            if(check(sorted,nums))
                return true;
            
        }
        
        return false;
        
    }
    
    boolean check(int[] sort, int[] ip){
        
        for(int i=0;i<sort.length;i++){
            if(sort[i]!=ip[i])
                return false;
        }
        
        return true;
        
    }
    
}

// using .cclone might give better memory usage, better upto 36mb ( 99.45% )

class Solution {
    public boolean check(int[] nums) {
                
        int sorted[]=nums.clone();
        Arrays.sort(sorted);
        
        for(int i=0;i<nums.length;i++){
            
            int first=nums[0];
            
            for(int j=0;j<nums.length-1;j++){
                
                nums[j]=nums[j+1];
                
            }
            
            nums[nums.length-1]=first;
            
            if(check(sorted,nums))
                return true;
            
        }
        
        return false;
        
    }
    
    boolean check(int[] sort, int[] ip){
        
        for(int i=0;i<sort.length;i++){
            if(sort[i]!=ip[i])
                return false;
        }
        
        return true;
        
    }
    
}