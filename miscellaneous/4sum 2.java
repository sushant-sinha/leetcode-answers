// SUSHANT SINHA

class Solution{
public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int a : A) {
            for (int b : B) {
                //int index = a + b;
                map.put((a+b), map.getOrDefault((a+b), 0) + 1);
            }
        }
        
        for (int c : C) {
            for (int d : D) {
                //int index = -(c + d);
                
                if (map.containsKey((c+d)*(-1))) {
                    result += map.get((c+d)*(-1));
                }
            }
        }
        
        return result;
    }
}

/*

Take the arrays A and B, and compute all the possible sums of two elements. Put the sum in the Hash map,
and increase the hash map value if more than 1 pair sums to the same value.

Compute all the possible sums of the arrays C and D. If the hash map contains the opposite value of the current sum,
increase the count of four elements sum to 0 by the counter in the map.


*/