// SUSHANT SINHA

// Fast Solution

class Solution {
    public int smallestRangeI(int[] A, int K) {

        int min = A[0], max = A[0];
        for (int x: A) {
        	
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        
        return Math.max(0, A[A.length-1] - A[0] - 2*K);
    }
}

// My Short Solution (Slow)

class Solution {
    public int smallestRangeI(int[] A, int K) {
        
        Arrays.sort(A);
        return Math.max(0, A[A.length-1] - A[0] - 2*K);

    }
}