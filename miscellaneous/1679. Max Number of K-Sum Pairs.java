// SUSHANT SINHA

// https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/_1679.java solution
// 33ms


class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ops = 0;
        for (int num : nums) {
            if (map.containsKey(k - num)) {
                map.put(k - num, map.get(k - num) - 1);
                ops++;
                if (map.get(k - num) == 0) {
                    map.remove(k - num);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return ops;
    }
}
