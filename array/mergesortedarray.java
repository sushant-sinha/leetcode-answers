// SUSHANT SINHA
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x,y=0;
        if(m>0 && n>0){
        for(int i=m;i<nums1.length;i++){
            if(nums1[i]==0) nums1[i]=nums2[y++];
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=i;j<nums1.length;j++){
            if(nums1[i]>nums1[j]){
                   x=nums1[j];nums1[j]=nums1[i];nums1[i]=x;
                }
            }
       }
        }
        else if(m==0){
                for(int i=0;i<n;i++){
                    nums1[i]=nums2[i];
                }
            }        
    }
}