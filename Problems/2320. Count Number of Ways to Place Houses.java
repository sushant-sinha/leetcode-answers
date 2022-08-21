// SUSHANT SINHA

// 22ms ( 47.80% ) 41.9mb ( 54.45% )

// intuition: using fibonacci series to calculate the number of possible arrangements on one side of the road, and then squaring it

// the number of possible arrangements on the one side of the road can be calculated using the fibonacci series..
// the same combination will be for the arrangements on the opposite side of the road

// if n==1: then the number of possible combinations of houses on one side of the road->2
// if n==2: then the number of possible combinations of houses on one side of the road->3
// if n==3: then the number of possible combinations of houses on one side of the road->5
// if n==4: then the number of possible combinations of houses on one side of the road->8... so on

// to get the final answer.. multiply both (square)

// the hint was useful (see the dp answer also)(used recusion)

class Solution {
    public int countHousePlacements(int n) {
        
        long singleSide=fibonacci(1,1,1,n);
        
        return (int)(((singleSide%(1000000007))*(singleSide%(1000000007)))%(1000000007));
        
    }
    
    long fibonacci(long a, long b, long c, long n){
        
        if(c==n)
            return ((a)%(1000000007)+(b)%(1000000007));
        
        else return fibonacci( ((a)%(1000000007)+(b)%(1000000007)) ,a,c+1,n);
        
    }
}