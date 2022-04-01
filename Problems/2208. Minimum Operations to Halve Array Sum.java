class Solution {
    public int halveArray(int[] nums) {
        
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        double tot=0;
        
        for(int i:nums){
            
            pq.add((double) i);
            tot+=(double) i;
            
        }
        
        double cursum=tot;
        
        int ans=0;
        
        while(cursum>tot/2){
            
            double max=pq.poll();
            
            max/=2;
            
            pq.add(max);
            
            cursum-=max;
            ans++;
            
        }
        
        
        
        return ans;
        
    }
}