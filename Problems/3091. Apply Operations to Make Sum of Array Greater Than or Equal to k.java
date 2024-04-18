// SUSHANT SINHA

// 4ms ( 47.20% ) 40.47mb ( 76.52% )

class Solution {

    public int minOperations(int k) {

        if(k==1)
            return 0;

        int ans=k-1;

        // iterating through the number of additions
        for(int i=1;i<=k/2;i++){
            
            // calculating the number of duplications needed after the increment
            int totalDuplications = duplicate(1+i, k);

            ans = Math.min(i+totalDuplications-1, ans);
        }

        return ans;
        
    }

    int duplicate(int i, int k){

        if(k==1)
            return 0;

        return (int)Math.ceil((double)k/(double)i);

    }
}