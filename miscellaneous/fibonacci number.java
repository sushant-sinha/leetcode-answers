// SUSHANT SINHA

class Solution {
    public int fib(int N) {
        
        if(N==0)return 0;
        if(N==1 || N==2)return 1;
        int ans=0,a=0,b=1;
        for(int i=3;i<=N;i++){
            ans=a+b;
            a=b;b=ans;
        }
        return (a+b);
    }
}