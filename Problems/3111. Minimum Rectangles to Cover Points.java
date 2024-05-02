class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {

        int ans=0;

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