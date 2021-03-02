// took from prashant404's solution in discuss tab

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int xSteps = Math.abs(points[i + 1][0] - points[i][0]);
            int ySteps = Math.abs(points[i + 1][1] - points[i][1]);
            time += Math.max(xSteps, ySteps);
        }
        return time;
    }
}
