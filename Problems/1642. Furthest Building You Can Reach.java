// SUSHANT SINHA

/*

Works fine for small number of testcases.
TLE

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        int ans=0,sum=0,index=heights.length-1;
        
        int gap[]=new int[heights.length];
        
        for(int i=1;i<heights.length;i++){
            
            if(heights[i-1]>=heights[i]){
                ans=i;
                continue;
            }
            
            else{
                
                gap[index--]=(heights[i]-heights[i-1]);
                
                sum+=heights[i]-heights[i-1];
                
                if(heights.length-index>ladders){
        
                    Arrays.sort(gap);
                    int temp=sum;
                    
                    for(int x=1;x<=ladders;x++)
                        temp-=gap[heights.length-x];


                    if(temp>bricks)
                        return i-1;
                    else
                        ans=i;
                
                }
                
                else
                    ans=i;
                
            }
            
        }
        
        return ans;
        
    }
}

*/

// discuss tab 
// 14ms ( 83.98% ) 49.4mb ( 91.93% )

class Solution {
    public int furthestBuilding(int[] H, int B, int L) {
        int len = H.length - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < len; i++) {
            int diff = H[i+1] - H[i];
            if (diff > 0) {
                if (L > 0) {
                    pq.add(diff);
                    L--;
                } else if (pq.size() > 0 && diff > pq.peek()) {
                    pq.add(diff);
                    B -= pq.poll();
                } else B -= diff;
                if (B < 0) return i;
            }
        }
        return len;
    }
}