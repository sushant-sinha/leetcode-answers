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