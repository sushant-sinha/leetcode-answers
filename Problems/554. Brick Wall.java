// from discuss section
// https://leetcode.com/problems/brick-wall/discuss/1170889/JS-Python-Java-C%2B%2B-or-Easy-Frequency-Map-Solution-w-Explanation

// 4ms ( 99.83% ) 41.9mb ( 79.03% )

class Solution {
    
    int best = 0;
    Map<Integer, Integer> freq = new HashMap<>();
    
    public int leastBricks(List<List<Integer>> wall) {
        for (int i = 0; i < wall.size(); i++)
            processRow(wall.get(i));
        return wall.size() - best;
    }
    
    public void processRow(List<Integer> row) {
        int rowSum = row.get(0);
        for (int j = 1; j < row.size(); j++) {
            int f = freq.getOrDefault(rowSum, 0) + 1;
            freq.put(rowSum, f);
            if (f > best) best = f;
            rowSum += row.get(j);
        } 
    }
}
