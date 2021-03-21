// SUSHANT SINHA

// my solution using int[][]
// 2ms ( 58.90% ) 38.9mb ( 48.80% )

class Solution {
    public boolean isPathCrossing(String path) {
        
        int visited[][]=new int[path.length()+1][2];
        
        int cur[]=new int[2];
        cur[0]=0;
        cur[1]=0;
        int i=0;
        visited[0][0]=0;
        visited[0][1]=0;
        
        for(char x:path.toCharArray()){
            
            
            if(x=='N'){
                cur[1]++;
            }
            else if(x=='S'){
                cur[1]--;
            }
            else if(x=='W'){
                cur[0]--;
            }
            else{
                cur[0]++;
            }
            
            
            
            if(check(visited,cur))
                return true;
            
            visited[++i][0]=cur[0];
            visited[i][1]=cur[1];
        }
        
        return false;
        
        
    }
    
    boolean check(int[][] x,int[] y){
        for(int[] a:x){
            if(a[0]==y[0] && a[1]==y[1])
                return true;
        }
            
        
        return false;
        
    }
    
}

// 1ms ( 92.12% ) 37.4mb ( 96.40% )

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

