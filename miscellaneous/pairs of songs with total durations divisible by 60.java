// SUSHANT SINHA

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int arr[]  = new int[60];
        int res = 0;
        for (int t : time) {
            res += arr[(60 - t % 60) % 60];
            arr[t % 60] ++;
        }
        return res;
    }
}