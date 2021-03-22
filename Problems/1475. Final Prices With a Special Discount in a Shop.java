// SUSHANT SINHA

// 1ms ( 97.36% ) 39.2mb ( 60.06% )

class Solution {
    public int[] finalPrices(int[] prices) {
        
        for(int i=0;i<prices.length-1;i++){
            int temp=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] <= prices[i]){
                    temp=prices[j];
                    break;
                }
            }
            
            prices[i]-=temp;
        }
        
        return prices;
        
    }
}

// without temp variable
// 1ms ( 97.36% ) 38.8mb ( 91.43% )

class Solution {
    public int[] finalPrices(int[] prices) {
        
        for(int i=0;i<prices.length-1;i++){
            int temp=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] <= prices[i]){
                    temp=prices[j];
                    break;
                }
            }
            
            prices[i]-=temp;
        }
        
        return prices;
        
    }
}