// lee's solution"
// https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0/solutions/3203994/java-c-python-1-line-solution/

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