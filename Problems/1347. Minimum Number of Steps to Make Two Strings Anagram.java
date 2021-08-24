// SUSHANT SINHA

// 13ms ( 71.00% ) 39.3mb ( 83.11% )

class Solution {
    public int minSteps(String s, String t) {
        
        int ar1[]=new int[26];
        
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            
            // subtracting to nullify same character between s & t
            ar1[s.charAt(i)-'a']++;
            ar1[t.charAt(i)-'a']--;
            
        }
        
        // can use ans+= i>0 ? (-1)*i : i;........ but then have to divide the answer by 2 because even then the ones being replaced are also counted different :)

        for(int i:ar1)
            ans+= i>0 ? i : 0;
        
        return ans;
        
    }
}

