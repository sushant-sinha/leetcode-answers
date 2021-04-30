// SUSHANT SINHA

// using array
// 24ms( 97.19% ) 48.2mb ( 82.81% )

class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int ans=0,j=2;
        
        for(int i=0;i<(piles.length/3);i++){
            
            ans+=piles[piles.length-j];
            j+=2;
        }
        
        return ans;
        
    }
}

