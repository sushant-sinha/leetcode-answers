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