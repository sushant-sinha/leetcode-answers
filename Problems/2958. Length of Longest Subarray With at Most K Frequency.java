// SUSHANT SINHA

// 72ms ( 33.09% ) 61.25mb ( 6.68% )
// dont know why the efficiency is so low😅

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        // end is exclusive
        int start=0, end=0, len=nums.length, maxFreq=0, ans=0;
        
        HashMap<Integer, Integer> freq=new HashMap<>();
        
        // freq.put(nums[0], 1);
        
        while(end!=len){
            
            end++;
            
            // System.out.println("start = "+start+" end="+end);
            
            freq.put(nums[end-1], freq.getOrDefault(nums[end-1], 0)+1);
            
            maxFreq=Math.max(maxFreq, freq.get(nums[end-1]));
            
            // System.out.println(freq);
            
            // System.out.println("max cur "+maxFreq);
            
            int tempMax=0;
            
            if(maxFreq>k){
                // remove from start untill maxFreq comes into range of k
                
                while(start<end){
                    
                    freq.put(nums[start], freq.get(nums[start])-1);
                    
                    tempMax=Math.max(tempMax, freq.get(nums[start]));
                    
                    if(freq.get(nums[start]) == 0)
                        freq.remove(nums[start]);

                    
                    start++;

                    if(nums[start-1]==nums[end-1])
                    break;
                    
                    
                }
                
                maxFreq=tempMax;
                
            }
            
            
            // System.out.println("-------------start = "+start+" end="+end);
            
            ans=Math.max(ans, end-start);
            
            // System.out.println("ans "+ans);
            
        }
        
        
        return ans;
        
    }
}