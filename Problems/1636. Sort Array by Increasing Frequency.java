class Solution {
    public int[] frequencySort(int[] nums) {
        
        int freq[]=new int[201];
        
        for(int i:nums){
            
            freq[i+100]++;
            
        }
        
        int i=0;
        
        while(i!=nums.length){
            
            int smallest=Integer.MAX_VALUE,index=0;
            
            for(int j=200;j>=0;j--){
                if(freq[j]<smallest && freq[j]!=0){
                    smallest=freq[j];
                    index=j;
                }
            }
            
            while(smallest!=0){
                nums[i++]=index-100;
                --smallest;
            }
            
            freq[index]=0;
            
        }
        
        return nums;
        
    }
}