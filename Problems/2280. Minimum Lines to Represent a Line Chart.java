class Solution {
    public int minimumLines(int[][] stockPrices) {
        
        if(stockPrices.length<=2)
            return stockPrices.length-1;
        
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        
        //System.out.println((String)Arrays.deepToString(stockPrices));
        
        int ans=0;
        
        for(int i=0;i<stockPrices.length-2;i++){

            if((stockPrices[i+1][1]-stockPrices[i][1])*(stockPrices[i+2][0]-stockPrices[i+1][0])!=(stockPrices[i+2][1]-stockPrices[i+1][1])*(stockPrices[i+1][0]-stockPrices[i][0]))
                ans++;
            
        }
        
        return ++ans;
        
    }
    
    
    
}