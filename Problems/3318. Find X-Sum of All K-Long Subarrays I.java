class Solution {

    int numsCopy[];
    public int[] findXSum(int[] nums, int k, int x) {

        numsCopy=nums;

        int n= nums.length;
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            ans[i] = generateSum(i, i + k - 1, x);
        }
        return ans;
    }
    public int generateSum(int start, int end, int x) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = start; i <= end; i++) {
            hm.put(numsCopy[i], hm.getOrDefault(numsCopy[i], 0) + 1);
        }

        // referred this section
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> (b.getValue() == a.getValue())?b.getKey()-a.getKey() :b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.add(entry);
        }
        int sum = 0;
        while (x-- > 0 && !pq.isEmpty()) {
            Map.Entry<Integer, Integer> e = pq.poll();
            sum += e.getKey() * e.getValue();
        }
        return sum;
    }
}