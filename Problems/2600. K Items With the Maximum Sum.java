// SUSHANT SINHA

// 1ms ( 99.86% ) 40.3mb ( 59.76% )

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        
        if(k<=numOnes)
            return k;
        
        if(k<=(numOnes+numZeros))
            return numOnes;
        
        else{
            return (numOnes-(k-numOnes-numZeros));
        }
        
    }
}