class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int counter1[]=new int[100];
        int counter2[]=new int[100];
        
        int ans[]=new int[2];
        
        for(int i: nums1)
            counter1[i-1]++;
        
        for(int i: nums2){
            counter2[i-1]++;
            
            if(counter1[i-1]>0)
                ans[1]++;
            
        }
        
        for(int i: nums1)
            if(counter2[i-1]>0)
                ans[0]++;
        
        return ans;
        
    }
}