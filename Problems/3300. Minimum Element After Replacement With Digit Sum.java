class Solution {
    public int minElement(int[] nums) {

        int ans=Integer.MAX_VALUE;

        for(int i: nums){

            ans=Math.min(ans, sum(i));

        }

        return ans;
        
    }
    
    int sum(int num){

        int addition=0;

        while(num!=0){
            addition+=num%10;
            num/=10;
        }

        return addition;
    }
}