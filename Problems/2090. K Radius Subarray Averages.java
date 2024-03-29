// SUSHANT SINHA

// from discuss section
// 10ms ( 100% ) 58.5mb ( 60.00% )

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n =  nums.length;
        long sum = 0;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        int left = 0, right = 0, windowSize = 2*k+1;
        while( right  < n ){
            sum+=nums[right];
            if(right - left + 1 == windowSize){
                res[left+k] = (int) (sum/windowSize);
                sum-=nums[left];
                left++;
            }
            right++;
        }      
        return res;
    }
}


// my code...works for 35/36 test cases


class Solution {
    public int[] getAverages(int[] nums, int k) {
        
        //System.out.println(nums.length);
        
        long sum=0;
        int ans[]=new int[nums.length];
        
        int pointer=k, window=(2*k)+1;
        
        for(int i=0;i<k && i<nums.length ;i++){
            ans[i]=-1;
            ans[nums.length-1-i]=-1;
        }
        
        int i=0;
        
        for(;i<=k;i++){
                        
            if(i>nums.length){
                Arrays.fill(ans,-1);
                return ans;
            }
            
            sum+=nums[i];
            
        }
        
        for(;i<=2*k;i++){
            
            if(i>nums.length-1){
                Arrays.fill(ans,-1);
                return ans;
            }
            
            sum+=nums[i];
            
        }
        
        
        
        //System.out.println(sum);
        
        
        if(pointer<nums.length)
            ans[pointer]=(int)Math.floor((sum/window));
        
        //System.out.println(ans[pointer]);
        
        for(;i<nums.length;i++){
            
            sum+=nums[i];
            sum-=nums[pointer-k];
            ans[++pointer]=(int)(sum/window);
        }        
        
        return ans;
        
    }
}