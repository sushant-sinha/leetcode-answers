// SUSHANT SINHA

// 3ms ( 22.22% ) 41.6mb

class Solution {
    public int pivotInteger(int n) {
        
        if(n==1)
            return 1;
        
        int sum=(n)*(n+1)/2;
        
        for(int i=1;i<=n;i++){
            
            int left=(i)*(i+1)/2;
            int right=sum-left+i;
            
            //int right=((n-i+1)*(n-i+2)/2)+((i-1)*(n-i+1));
            
            if(left==right)
                return i;
            
        }
        
        return -1;
        
    }
}

// 0ms solution math logic from the submission tab

class Solution {
    
    static int sqrt(int n){
        return (int) Math.sqrt(n);
    }
    
    static boolean isPerfectSquare(int n, int sqr){
        return n*n == sqr;
    }
    
    public int pivotInteger(int n) {
        int c = (n * (n + 1)) / 2 ;
        int dis = 1 + 8*c;
        
        int sqrt = sqrt(c);
        
        //System.out.println(c+" "+dis+" "+sqrt);
        
        if(isPerfectSquare(sqrt, c)){
            return sqrt;
        }
        else{
            return -1;
        }
    }
}