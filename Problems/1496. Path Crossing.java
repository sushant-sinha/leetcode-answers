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


// class Solution {
//     public boolean isPathCrossing(String path) {
        
//         ArrayList<int[]> visited=new ArrayList<>();
        
//         int cur[]=new int[2];
//         cur[0]=0;
//         cur[1]=0;
//         visited.add(cur);
        
//         for(String x:path.split("")){
            
//             int temp[]=new int[2];
//             temp[0]=cur[0];
//             temp[1]=cur[1];
            
//             if(x.equals("N")){
//                 temp[1]++;
//             }
//             else if(x.equals("S")){
//                 temp[1]--;
//             }
//             else if(x.equals("W")){
//                 temp[0]--;
//             }
//             else if(x.equals("E")){
//                 temp[0]++;
//             }
            
            
            
//             if(check(visited,temp))
//                 return true;
            
//             // if(check(visited,cur)){
//             //     return true;
//             // }
//             // else
//             //     visited.add(cur);
            
//             visited.add(temp);
//             cur[0]=temp[0];
//             cur[1]=temp[1];
//             //System.out.println(cur[0]+" "+cur[1]);
//         }
        
//         return false;
        
        
//     }
    
//     boolean check(ArrayList<int[]> x,int[] y){
        
//         System.out.println("----------");
        
//         for(int[] a:x){
//             System.out.println(a[0]+" "+a[1]);
//             if(a[0]==y[0] && a[1]==y[1])
//                 return true;
//         }
            
        
//         return false;
        
//     }
    
}