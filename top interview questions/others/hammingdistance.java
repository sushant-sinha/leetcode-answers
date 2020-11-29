// SUSHANT SINHA
class Solution {
    public int hammingDistance(int x, int y) {
        x=x^y;
        
        // if we XOR we will get 1 where there are different bits.
        
        //int ans=0;
        // for(int i=0;i<32;i++){
        //     if((x&1)==1)ans++;
        //     x>>=1;
        // }
        // return ans;
        return Integer.bitCount(x);
    }
}