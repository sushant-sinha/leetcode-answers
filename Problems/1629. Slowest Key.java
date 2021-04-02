// SUSHANT SINHA

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        int ans[]=new int[26];
        char strip[]=keysPressed.toCharArray();
        ans[strip[0]-'a'] = releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            
            ans[strip[i]-'a'] = releaseTimes[i] - releaseTimes[i-1] > ans[strip[i]-'a'] ? releaseTimes[i] - releaseTimes[i-1] : ans[strip[i]-'a'];
                        
            
        }
        
        int max=-1;
        char ret=strip[0];
        
        for(int i=0;i<ans.length;i++){
            
            if(max<=ans[i]){
                
                max=ans[i];
                
                ret=(char)(97+i);
                
                
            }
            
        }
        
        return ret;
        
    }
}