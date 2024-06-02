class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        int[] prefixXOR = new int[n + 1];
        
        for (int i = 0; i < n; ++i) {
            prefixXOR[i+1] = prefixXOR[i] ^ arr[i];
        }
        
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (prefixXOR[i] == prefixXOR[j+1]) {
                    count += (j - i);
                }
            }
        }
        
        return count;
    }
}