// SUSHANT SINHA

// 21ms ( 22.75% ) 161.4mb ( 64.59% )

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> less=new ArrayList<>();
        ArrayList<Integer> more=new ArrayList<>();
        
        int[] ans=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]<pivot)
                less.add(nums[i]);
            
            else if(nums[i]>pivot)
                more.add(nums[i]);
            
        }
        
        int index=0;
        
        for(;index<less.size();index++)
            ans[index]=less.get(index);
        
        int same=nums.length-less.size()-more.size();
        
        while(same!=0){
            ans[index++]=pivot;
            same--;
        }
        
        int curlen=nums.length-more.size();
        
        
        for(;index<nums.length;index++){
            ans[index]=more.get(index-curlen);
        }
        
        return ans;
            
        
    }
}