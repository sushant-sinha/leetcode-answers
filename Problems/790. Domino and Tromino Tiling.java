// SUSHANT SINHA

// 0ms ( 100% ) 38.9mb ( 97.34% )
// refer https://github.com/sushant-sinha/leetcode-answers/blob/main/Problems/790.%20Domino%20and%20Tromino%20Tiling%20pic.png image for the intuition
// image courtesy: https://leetcode.com/1120131418/ (from the discuss tab)

class Solution {
    public int numTilings(int n) {

        int ans=0;

        if(n<3)
        return n;

        long ar[]=new long[4];

        ar[0]=1;
        ar[1]=1;
        ar[2]=2;

        for(int i=3;i<=n;i++){

            ar[3]=(2*(ar[2])+ar[0])%1000000007;
            ar[0]=ar[1];
            ar[1]=ar[2];
            ar[2]=ar[3];

            // System.out.println(ar[3]);
        }

        return (int)ar[3];
        
    }
}