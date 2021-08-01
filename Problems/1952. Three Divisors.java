class Solution {
    public boolean isThree(int n) {
     
        int x=0;
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                x++;
        }
        
        return x==2;
        
    }
}