class Solution {
    public int maximumPrimeDifference(int[] nums) {

        int start=0, end=0;

        for(int i=0;i<nums.length;i++){

            if(isPrime(nums[i])){
                start=i;
                break;
            }

        }

        for(int i=nums.length-1;i>=0;i--){

            if(isPrime(nums[i])){
                end=i;
                break;
            }
            
        }

        return end-start;
        
    }

    boolean isPrime(int n){

        if(n==1)
            return false;

        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }

        return true;
    }
}