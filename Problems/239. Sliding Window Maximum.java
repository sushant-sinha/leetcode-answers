// my intuition
// the code passed 44/51 testcases

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int ans[]=new int[nums.length-k+1];
        
//         // the minimum value permitted in the nums array is -10^4
//         Arrays.fill(-10001);
        
        PriorityQueue<Integer> q=new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        
        int i=0, index=0;
        
        for(;i<k;i++){
            
            q.add(nums[i]);
            
        }
        
        ans[index]=q.peek();
        
        index++;
        
        // starting the for loop
        
        for(;i<nums.length;i++){
            
            q.remove(nums[i-k]);
            Iterator it = q.iterator();
            
            while (it.hasNext())
                if((int)it.next()<nums[i])
                    it.remove();
            
            
            q.add(nums[i]);            
            
            
            //System.out.println(q.size());
            
            ans[index]=q.peek();
            
            index++;
            
        }
        
        //System.out.println(ans.length+" "+nums.length);
        
        return ans;
        
    }
}