class Solution {

    public long minOperations(int[] nums1, int[] nums2, int k) {
        
        long numberOfTimesOperationNeeded=0, ans=0;

        if(k==0){

            for(int i=0;i<nums1.length;i++){
                if(nums1[i]!=nums2[i])
                return -1;
            }

        }

        for(int i=0;i<nums1.length;i++){

            if(nums1[i]!=nums2[i]){

                int calc=calculate( (nums1[i]-nums2[i]), k);
                if( calc == 0)
                return -1;

                numberOfTimesOperationNeeded+=calc;

                ans+=Math.abs(calc);
            }

        }

        // System.out.println(numberOfTimesOperationNeeded);

        if(numberOfTimesOperationNeeded!=0)
        return -1;

        return ans/2;
        
    }

    int calculate(int diff, int k){

        if(diff%k==0){
            return diff/k;
        }

        else return 0;

    }
}