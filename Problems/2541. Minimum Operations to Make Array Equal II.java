// SUSHANT SINHA

// 5ms ( 76.16% ) 60mb ( 96.80% )

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

                ans+= calc<0 ? calc*-1 : calc;
            }

        }

        // System.out.println(numberOfTimesOperationNeeded);

        if(numberOfTimesOperationNeeded!=0)
        return -1;

        return ans/2;
        
    }

    // can skip this function and add the same logic within the for loop
    int calculate(int diff, int k){

        if(diff%k==0){
            return diff/k;
        }

        else return 0;

    }
}