// SUSHANT SINHA

// based on solution below this section
// 2ms ( 95.30% ) 39.8mb ( 93.51% )

class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length()+1];
        int left = 0, right = s.length();
        
        for(int i = 0; i < s.length(); i++){
            
            ans[i]= 'I'==s.charAt(i) ? left++ : right--;
            
        }
        
        ans[s.length()]=left;
        
        // using System.gc() can give 39.1mb ( 100% )... but the runtime reduces to 3ms ( 31.47% )
        //System.gc();
        
        return ans;
    }
}



// problem statement was not well structured... few hints from the examples were not enough :(
// had to refer to the discussion section

// solution from https://leetcode.com/problems/di-string-match/discuss/1375270/JAVAororBeats-100-oror-Two-pointer

// 2ms ( 95.30% ) 40mb ( 78.75% )

class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length()+1];
        int left = 0;
        int right = s.length();
        
        for(int i = 0; i < res.length; i++){
            if(left == right){
                res[i] = left;
                break;
            }
            
            if(s.charAt(i) == 'I'){
                res[i] = left;
                left++;
            }
            
            else{
                res[i] = right;
                right--;
            }
        }
        
        return res;
    }
}