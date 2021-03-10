// SUSHANT SINHA

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i=0;
        for(;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int x=0;x<nums2.length;x++){
            arr[i]=nums2[x];i++;
        }
        Arrays.sort(arr);
        if(arr.length%2!=0)return (double)arr[arr.length/2];
        else return (double)(arr[(arr.length/2)-1]+arr[arr.length/2])/2;
    }
}