// SUSHANT SINHA

// 1ms 41.1mb

class Solution {
    
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        Arrays.sort(hours);
        
        int ans=0;
        
        for(int i=hours.length-1; i>=0; i--){
            
            if(hours[i]>=target)
                ans++;
            else
                break;
        }
        
        return ans;
        
    }
}