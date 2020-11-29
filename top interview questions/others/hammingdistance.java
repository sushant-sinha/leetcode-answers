// SUSHANT SINHA
class Solution {
    public int hammingDistance(int x, int y) {
       
    	// if we XOR we will get 1 where there are different bits.

        x=x^y;
        
        //int ans=0;
        // for(int i=0;i<32;i++){
        //     if((x&1)==1)ans++;
        //     x>>=1;
        // }
        // return ans;
        return Integer.bitCount(x);
    }
}