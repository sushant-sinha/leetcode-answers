// SUSHANT SINHA

// new solution... easy to understand
// 27th of November
// 1ms ( 100% ) 47.8mb ( 98.09% )

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int temp=1;
        
        int zero=-1,counter=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                
                counter++;
                
                if(counter>1){
                    Arrays.fill(nums,0);
                    return nums;
                }
                
                zero=i;
                
                continue;
            }
            
            temp*=nums[i];
            
        }
        
        if(zero!=-1){
            Arrays.fill(nums,0);
            nums[zero]=temp;
        }
        
        else{
            
            for(int i=0;i<nums.length;i++)
                nums[i]=temp/nums[i];
            
        }
        
        return nums;
        
    }
}




// old solution 13th of April
// 1ms ( 100% ) 47.1mb ( 99.74% )

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(true){
            int pro=1;
            boolean x=true;
            for(int a:nums){
                pro*=a;
                if(a==0){
                    x=false;
                    break;
                }
            }
            
            if(x){
                for(int i=0;i<nums.length;i++)
                    nums[i]=pro/nums[i];
                return nums;
            }
                    
        }
        
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            ans[i]=pro(i,nums);
        
        return ans;
        
    }
    
    int pro(int k, int[] nums){
        int ans=1;
        
        for(int i=0;i<nums.length;i++){
            
            if(i==k)
                continue;
            
            if(nums[i]==0)
                return 0;
            
            ans*=nums[i];
            
        }
        
        return ans;
        
    }
}