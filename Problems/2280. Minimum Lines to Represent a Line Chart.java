// SUSHANT SINHA

// 39ms ( 98.90% ) 88.88mb ( 96.49% )

// wasn't able to solve using the basic m1==m2 logic (see the reason in the for loop)
// https://leetcode.com/problems/minimum-lines-to-represent-a-line-chart/discuss/2119896/Java-Solution(All-test-case-passed)

class Solution {
    public int minimumLines(int[][] stockPrices) {
        
        if(stockPrices.length<=2)
            return stockPrices.length-1;
        
        
        // i will first sort the array according to the dates
        // using overloaded Arrays.sort
        // here... a[0],b[0] means comparing the 0th index values of the array
        
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        
        //System.out.println((String)Arrays.deepToString(stockPrices));
        
        int ans=0;
        
        for(int i=0;i<stockPrices.length-2;i++){
            
            
            /*
            
                    we will check m1==m2
            
                    (y2-y1)/(x2-x1)==(y3-y2)/(x3-x2)
                    
                    division leads to the rounding.. the 9th place is being rounded..
                    the 80-82 test cases were failed because of this rounding
                    
                    solution for this problem: cross multiplying
                    
                    (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1)
                    
                    multiplication was having no issues with the precision (as expected)                    
                    
            
            */
            
            
            if((stockPrices[i+1][1]-stockPrices[i][1])*(stockPrices[i+2][0]-stockPrices[i+1][0])!=(stockPrices[i+2][1]-stockPrices[i+1][1])*(stockPrices[i+1][0]-stockPrices[i][0]))
                ans++;
            
        }
        
        return ++ans;
        
    }
    
    
    
}