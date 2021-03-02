// took from prashant404's solution in discuss tab

// 0ms ( 100% ) 38.2mb ( 98.74% )

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

// 1ms ( 38.65% ) 38.3mb ( 90.93% )

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] point1 = points[i];
            int[] point2 = points[i + 1];
            int x1 = point1[0], y1 = point1[1];
            int x2 = point2[0], y2 = point2[1];
            int hSteps = x2 - x1;
            int vSteps = y2 - y1;

            int diagonal = Math.min(Math.abs(vSteps), Math.abs(hSteps)); // diagonal travel
            time += diagonal;
            x1 += Math.signum(hSteps) * diagonal;
            y1 += Math.signum(vSteps) * diagonal;

            // after travelling from point1 diagonally, travel remainder to point 2 vertically or horizontally
            int remainingLinear = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            time += remainingLinear;
        }
        return time;
    }
}