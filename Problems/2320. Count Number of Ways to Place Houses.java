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