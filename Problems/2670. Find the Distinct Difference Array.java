// SUSHANT SINHA

// 6ms ( 100% ) 43.8mb ( 20% )

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        
        int len=nums.length;
        
        int prefixAr[]=new int[len];
        int suffixAr[]=new int[len];
        
        HashSet<Integer> ltor = new HashSet<>();
        HashSet<Integer> rtol = new HashSet<>();
        
        for(int i=0;i<len-1;i++){
            
            ltor.add(nums[i]);
            prefixAr[i]=ltor.size();
            
            rtol.add(nums[len-i-1]);
            suffixAr[len-i-2]=rtol.size();
            
        }
        
        ltor.add(nums[len-1]);
        prefixAr[len-1]=ltor.size();
        
        for(int i=0;i<len;i++){
            // System.out.println(prefixAr[i]+" "+suffixAr[i]);
            nums[i]=prefixAr[i]-suffixAr[i];
            
        }
        
        return nums;
        
    }
}