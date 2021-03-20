class Solution {
    public boolean isPathCrossing(String path) {
        var cache = new HashSet<Point>();
        var last = new Point(0, 0);
        cache.add(last);
        for (int i = 0; i < path.length(); i ++) {
            var next = next(last, path.charAt(i));
            if (!cache.add(next)) return true;
            last = next;
        }
        return false;
    }
    
    static Point next(Point last, char direction) {
        if (direction == 'N')       return new Point(last.x, last.y + 1);
        else if (direction == 'S')  return new Point(last.x, last.y - 1);
        else if (direction == 'E')  return new Point(last.x + 1, last.y);
        else                        return new Point(last.x - 1, last.y);
    }
    
    static final class Point {
        final int x;
        final int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public boolean equals(Object o) {
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}