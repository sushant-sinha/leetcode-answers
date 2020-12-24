// SUSHANT SINHA

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2 || n==1073741824)return true;
        
        if(n>1073741824)return false;
        
        int temp=2;
        
        while(temp<n){
            temp*=2;
        }
        
        return temp==n ? true : false;
        
    }
}