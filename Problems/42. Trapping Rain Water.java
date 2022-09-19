// SUSHANT SINHA

// 1ms ( 99.76% ) 42.9mb ( 95.11% )

// needs 2 arrays.. sell all the 4 approaches given in the solution tab
// link: https://leetcode.com/problems/trapping-rain-water/solution/

class Solution {
    public int trap(int[] height) {
        
        int l=height.length;
        
        int maxL[]=new int[l];
        
        maxL[0]=0;
        
        int curmax=height[0];
        
        for(int i=1;i<l;i++){
            
            if(height[i]>curmax){
                maxL[i]=0;
                curmax=height[i];
            }
            
            else
            maxL[i]=curmax-height[i];
            
        }
        
        int maxR[]=new int[l];
        
        maxR[l-1]=0;
        
        curmax=height[l-1];
        
        for(int i=l-2;i>=0;i--){
            
            if(height[i]>curmax){
                maxR[i]=0;
                curmax=height[i];
            }
            
            else
            maxR[i]=curmax-height[i];
            
        }
        
        int ans=0;
        
        for(int i=0;i<l;i++){
            //System.out.println(height[i]+" "+maxL[i]+" "+maxR[i]);
            
            ans+=Math.min(maxR[i],maxL[i]);
        }
        
        return ans;
        
    }
}