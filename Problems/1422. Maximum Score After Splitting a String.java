// SUSHANT SINHA

// 1ms ( 91.01% ) 36.6mb ( 97.63% )

class Solution {
    public int maxScore(String s) {
        
        int ans=0;
        
        // onesum for keeping the number of ones (prefix sum)
        // counted for keeping the count of the number of ones already seen
        int onesum=0,counted=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                onesum++;
        }
        
        for(int i=0;i<s.length()-1;i++){
            
            if(s.charAt(i)=='1'){
                
                // increasing counted since we have seen '1'
                counted++;                
                ans = ans<(onesum-counted)+i+1-counted ? (onesum-counted)+i+1-counted : ans;
                
            }
            
            else{
                ans = ans<(onesum-counted)+i+1-counted ? (onesum-counted)+i+1-counted : ans;
            }
            
            //System.out.println(i+" "+ans);
        }
        
        
        return ans;
    }
}