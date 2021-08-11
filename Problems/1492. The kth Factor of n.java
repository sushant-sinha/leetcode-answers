class Solution {
    public int kthFactor(int n, int k) {
        
        int i=1;
        
        for(;i<=n/2;i++){
            if(n%i==0)
                k--;
            if(k==0)
                break;
        }
        
        if(k==1)
            return n;
        
        return k==0 ? i : -1;
        
    }
}