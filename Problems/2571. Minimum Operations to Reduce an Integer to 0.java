// referred solution tab

class Solution {
    // public int minOperations(int n) {
        
        // int ans=0;
        
        // if(n==1)
        //     return 1;
        
        // return helper(n, 0);

        // maybe bit manipulation??

        // return 7;
        
    // }
    
        public int minOperations(int n) {
        int res = 0;
        while (n > 0) {
            if ((n & 3) == 3) {
                n++;
                res++;
            } else {
                res += n & 1;
                n >>= 1;
            }
        }
        return res;
    }
}