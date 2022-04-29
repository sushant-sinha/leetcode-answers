// SUSHANT SINHA

// 7ms ( 10.87% ) 51.5mb ( 20% )

/*

tried using something other than a basic for loop iteration (backfired as it had worse performance)

sorting the array and then iterating it from the maximum value (because we need the maximum value with the least distance)
when we see that the distance has increased from that of the previous element, we will break, since the array is sorted and going down the array will only lead to increase in the distance from 0

*/

class Solution {
    public int findClosestNumber(int[] nums) {
        
        // 2 values to be stored: i) the number itself and ii) the distance from 0
        int ans[]=new int[2];
        ans[1]=1000000;
        
        Arrays.sort(nums);
        int i=nums.length-1;
        
        int distance;
        
        while(i>=0){
            
            distance=nums[i]>0 ? nums[i] : nums[i]*(-1);
            //System.out.println("new dist"+distance+" old dist"+ans[1]);

            
            if(distance<ans[1]){
                
                ans[0]=nums[i];
                ans[1]=distance;
                
            }
            
            else if(distance==ans[1] && nums[i]==ans[0]){
                --i;
                continue;
            }
            
            else
                break;
            
            --i;
            
        }
        
        return ans[0];
        
    }
}

// (simple) best solution from the submission tab
// 1ms ( 100% ) 42mb ( 91.12% )

class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int currDiff=Math.abs(nums[i]);
            
            if(currDiff<minDiff){
                minDiff=currDiff;
                ans=nums[i];
            }else if(currDiff==minDiff){
                ans=Math.max(ans,nums[i]);
            }
        }
        return ans;
    }
}