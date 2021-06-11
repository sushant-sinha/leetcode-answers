// https://leetcode.com/problems/matrix-cells-in-distance-order/discuss/1004716/JAVA-oror-Comparator-oror-Easy-to-understand

// 11ms ( 63.87% ) 41.4mb ( 24.43% )

class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r, int c) {
        int index = 0;
        int[][] result = new int[R*C][2];
        
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                result[index][0] = i;
                result[index][1] = j;
                index++;
            }
        }
        
        Arrays.sort(result, (a, b)-> 
            (Math.abs(r-a[0])+Math.abs(c-a[1])) - (Math.abs(r-b[0])+Math.abs(c-b[1]))
        );
        
        return result;
    }
}

// couldnt complete

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        int ans[][] = new int[rows*cols][2];
        
        HashMap<Integer[],Integer> map = new HashMap<Integer[],Integer>();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                int d=Math.abs(rCenter-i)+Math.abs(cCenter-j);
                System.out.println(i+" "+j+" "+" "+d);
                map.put(new Integer[]{i,j}, d);

            }
        }

        // sorting the hashmap

        Map<Integer[],Integer> map1 = sortByValue(map);
        
        
        
        return ans;
        
    }

    public HashMap<Integer[],Integer> sortByValue( HashMap<Integer[],Integer> map){

        List<Map.Entry<Integer[],Integer>> list = new LinkedList<Map.Entry<Integer[],Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer[],Integer>>(){
            public int compare(Map.Entry<Integer[],Integer>o1,
                               Map.Entry<Integer[],Integer>o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Integer[],Integer> ans = new HashMap<Integer[],Integer>();
        for(Map.Entry<Integer[],Integer> a : list){
            ans.put(a.getKey(),a.getValue());
        }
        
        for ( Integer[] key : ans.keySet() ) {
            System.out.println( Arrays.toString(key) );
        }

        return ans;
    }

}