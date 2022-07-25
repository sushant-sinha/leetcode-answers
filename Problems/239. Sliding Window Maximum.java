// SUSHANT SINHA

// 24ms ( 96.62% ) 138.5mb ( 81.04% )

// couldn't solve the question

class Solution {
    public int[] maxSlidingWindow(int[] in, int w) {
        final int[] max_left = new int[in.length];
    final int[] max_right = new int[in.length];

    max_left[0] = in[0];
    max_right[in.length - 1] = in[in.length - 1];

    for (int i = 1; i < in.length; i++) {
        max_left[i] = (i % w == 0) ? in[i] : Math.max(max_left[i - 1], in[i]);

        final int j = in.length - i - 1;
        max_right[j] = (j % w == 0) ? in[j] : Math.max(max_right[j + 1], in[j]);
    }

    final int[] sliding_max = new int[in.length - w + 1];
    for (int i = 0, j = 0; i + w <= in.length; i++) {
        sliding_max[j++] = Math.max(max_right[i], max_left[i + w - 1]);
    }

    return sliding_max;
    }
}

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