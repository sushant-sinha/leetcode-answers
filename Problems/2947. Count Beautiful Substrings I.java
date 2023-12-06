// SUSHANT SINHA

// not efficient
// 118ms ( 37.53% ) 43.74mb ( 12.00% )

class Solution {
    public int beautifulSubstrings(String s, int k) {
        
        int ans=0;
        
        int len=s.length();
        
        for(int i=0; i<len-1; i++){
            
            // 0: vowel, 1: consonant
            int count[]=new int[2];
            
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                count[0]++;
            
            else
                count[1]++;
                
            
            for(int j=i+1; j<len; j++){
                
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
                    count[0]++;
                
                else
                    count[1]++;
                
                
                if(count[0]==count[1] && (count[0]*count[1])%k ==0)
                    ans++;
                
            }
            
        }
        
        return ans;
    }
}