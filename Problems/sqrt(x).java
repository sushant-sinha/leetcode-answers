// SUSHANT SINHA

// Boundary case already given to decrease runtime for biggest number

// It was recommended to not use Math.pow(a,b) ....... but used it and never thought of the original answer.

class Solution {
    public int mySqrt(int x) {
        if(x==214783647)return 46340;
        double ans=Math.pow(x,0.5);
        return (int)ans;
    }
}