// SUSHANT SINHA

// 7ms ( 26.37% ) 106.45mb ( 5.00% )

class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {

        int ans=0;

        // tried using the treemap and treeset for getting it naturally sorted

        // TreeMap<Integer, Integer> sortedPoints=new TreeMap<>();
        // Too expensive to use arraylist as we will be sorting it again
        ArrayList<Integer> allPoints=new ArrayList<>();

        for(int i[]: points){

            // sortedPoints.put(i[0], sortedPoints.getOrDefault(i[0], 0)+1);
            allPoints.add(i[0]);
        }

        Collections.sort(allPoints);

        for(int i=0;i<points.length;){

            ans++;
            
            int start=allPoints.get(i);
            // System.out.println("start = "+start);

            for(;i<points.length;i++){
                if(allPoints.get(i)-start>w){
                    break;
                }
            }


        }

        return ans;
        
    }
}