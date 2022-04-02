// SUSHANT SINHA

// 200ms ( 92.80% ) 59.2mb ( 90.88% )

class Solution {
    public int halveArray(int[] nums) {
        
        // defining reverse order to maintain the maximum number at the head
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        double tot=0;
        
        for(int i:nums){
            
            pq.add((double) i);
            tot+=(double) i;
            
        }
        
        double cursum=tot;
        
        int ans=0;
        
        while(cursum>tot/2){
            
            // get the maximum number (optimal)
            double max=pq.poll();
            
            max/=2;
            
            // put back the max number divided by 2 in the queue
            pq.add(max);
            
            cursum-=max;
            ans++;
            
        }
        
        return ans;
        
    }
}