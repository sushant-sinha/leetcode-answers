// SUSHANT SINHA

// input array was too small to need any optimization...
// brute force would have worked just fine

// 10ms ( 33.33% ) 43.4mb ( 66.67% )

class Solution {
    public int alternatingSubarray(int[] nums) {
        
        int ans=-1;
        
        for(int i=0;i<nums.length;i++){
            
            int tempans=-1;
            int power=0;
            
            for(int j=i+1;j<nums.length;j++){
                
                // System.out.println(j+"="+nums[j]+" "+(j-1)+"="+nums[j-1]+" "+Math.pow(-1, power)+" condition="+(nums[j]-nums[j-1]==Math.pow(-1, power)));
                if(nums[j]-nums[j-1]==Math.pow(-1, power)){
                    tempans++;
                    power++;
                }
                
                else
                    break;
            }
            
            ans = tempans > ans ? tempans : ans;
            
        }
        
        return ans==-1 ? -1 : ans+2;
        
    }
}