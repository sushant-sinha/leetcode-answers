// SUSHANT SINHA

// 31ms ( 78.45% ) 55.3mb ( 95.50% )

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        
        int ans=0,i=0;
        
        while(i<costs.length && coins>=costs[i]){
            
            coins-=costs[i];
            i++;
            ans++;
            
        }
        
        return ans;
        
    }
}