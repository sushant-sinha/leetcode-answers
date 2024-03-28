// SUSHANT SINHA

// 1ms ( 99.96% ) 42.53mb ( 83.26% )

class Solution {
    public int sumOfEncryptedInt(int[] nums) {

        int sum = 0;

        for(int i: nums)
            sum+=encrypt(i);

        return sum;
        
    }

    int encrypt(int i){

        int max=-1, ans=0;;

        while(i!=0){
            max = max > i%10 ? max : i%10;
            i/=10;
            ans*=10;
            ans+=1;
        }

        return ans*max;

    }
}