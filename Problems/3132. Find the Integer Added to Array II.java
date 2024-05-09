class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<=nums1.length-nums2.length;i++){

            int diff=nums2[0]-nums1[i];

            int index=0;
            boolean cur=true;

            boolean check=check(nums1, nums2, diff, i);

            if(check)
                ans=Math.min(diff,ans);

        }

        return ans;
        
    }

    boolean check(int ar1[], int ar2[], int diff, int index){

        int ar2Index=0;

        for(;index<ar1.length;index++){

            if(ar2Index==ar2.length)
                return true;

            if(ar1[index]+diff==ar2[ar2Index])
                ar2Index++;
        }

        if(ar2Index==ar2.length)
            return true;
        
        else
            return false;
    }
}