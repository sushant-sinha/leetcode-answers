// SUSHANT SINHA

class Solution {
    public int smallestRangeII(int[] A, int K) {
        if(A == null || A.length <= 1) return 0;
        // we now sort the array
        Arrays.sort(A);
        int n = A.length;
        int min = 99999;
        // find the min
        for(int i=0;i<n;i++){
            int f = Math.min(A[0]+K, A[i]-K);
            int s = Math.max(A[n-1]-K, (i-1>=0 ? A[i-1]+K : A[n-1]-K ));
            min = Math.min(min, s-f);
        }
        return min;
    }
}