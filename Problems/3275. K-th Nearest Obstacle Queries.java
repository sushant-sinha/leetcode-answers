class Solution {
    public int[] resultsArray(int[][] queries, int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(k, Collections.reverseOrder());

        int[] ans=new int[queries.length];

        int maxValueInWindow=-1;
        int sizeOfQueue=0;

        int index=0;

        for(int i[]: queries){

            int tempDist=Math.abs(i[0])+Math.abs(i[1]);

            if(sizeOfQueue<k){
                pq.add(tempDist);
                
                sizeOfQueue++;
                maxValueInWindow=Math.max(maxValueInWindow, tempDist);
                // System.out.println("adding "+tempDist+ " size= "+sizeOfQueue);
            }

            else if(maxValueInWindow>=tempDist){
                pq.add(tempDist);
                pq.poll();
                maxValueInWindow=Math.max(maxValueInWindow, tempDist);
            }

            if(sizeOfQueue==k){
                ans[index++]=pq.peek();
                
            }

            else
                ans[index++]=-1;

            // System.out.println("peek= "+pq.peek());
            // System.out.println("pq.size= "+pq.size());

            // System.out.println("-----------------------------------------------------");
            
        }

        return ans;
        
    }
}