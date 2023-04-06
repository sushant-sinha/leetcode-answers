class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        
        for(int i=0;i<nums1.length;i++){
            
            if(min1>nums1[i]){
                min1=nums1[i];
            }
            
            for(int j:nums2){
                // System.out.println("min1="+min1+" j="+j);
                if(j==nums1[i])
                    return j;
            }
            
        }
        
        for(int i:nums2)
            if(i<min2)
                min2=i;
        
        if(min1>min2){
            return min2*10+min1;
        }
        
        else
            return min1*10+min2;
        
    }
}