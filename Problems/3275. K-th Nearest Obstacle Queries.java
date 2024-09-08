// SUSHANT SINHA

// 113ms ( 52.89% ) 146.76mb ( 40.57% )

class Solution {
    public int[] resultsArray(int[][] queries, int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(k, Collections.reverseOrder());

        int[] ans=new int[queries.length];

        int maxValueInWindow=-1, sizeOfQueue=0, kthValue=-1, index=0;

        for(int i[]: queries){

            int tempDist=Math.abs(i[0])+Math.abs(i[1]);

            if(++sizeOfQueue<=k){
                pq.add(tempDist);
                
                maxValueInWindow=Math.max(maxValueInWindow, tempDist);
                kthValue=sizeOfQueue==k ? maxValueInWindow : -1;
            }

            else if(maxValueInWindow>=tempDist){
                pq.add(tempDist);
                pq.poll();
                
                maxValueInWindow=pq.peek();
                kthValue=maxValueInWindow;
            }

            ans[index++]=kthValue;
            
        }

        return ans;
        
    }
}