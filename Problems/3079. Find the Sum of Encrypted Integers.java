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

        int len=0, max=-1;

        while(i!=0){
            max = max > i%10 ? max : i%10;
            len++;
            i/=10;
        }

        int ans=0;

        while(len!=0){
            ans*=10;
            ans+=max;
            len--;
        }

        return ans;

    }
}