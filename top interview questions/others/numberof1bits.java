// SUSHANT SINHA
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        // METHOD USING BIT OPERATIONS ......... Faster way
        
        int ans=0;
        for(int i=0;i<32;i++){
            if((n&1)==1)ans++;
            n>>=1;
        }
        return ans;
        
        // METHOD USING Integer.bitCount(n)
        
        // System.out.println(Integer.toBinaryString(n));
        
        // return Integer.bitCount(n);
        
    }
}