// SUSHANT SINHA

// 0ms ( 100% ) 40.22mb ( 63.68% )

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        if(x==100)
            return 1;

        return ( x%(x%10+x/10)==0 ) ? (x%10+x/10) : -1;
        
    }
}