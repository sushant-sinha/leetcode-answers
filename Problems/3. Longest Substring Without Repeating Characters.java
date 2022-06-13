// SUSHANT SINHA

// 33ms ( 20.25% ) 42.1mb ( 95.75% )

// using character array to store the characters present in the current window (current pass while loop) 
// could have been done in a single pass

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<2)
            return s.length();
        
        int ans=0;
        int curLen=0;
        
        int seen[]=new int[128];
        
        for(int i=0;i<s.length();i++){
            
            // should be considered as brute force because the curIndex is being used which doesn't tracks the previously visited index (starting from the ith index again)
            curLen=0;
            int curIndex=i;
            
            while(curIndex<s.length() && seen[(int)s.charAt(curIndex)]==0){
                
                // System.out.println((int)s.charAt(i));
                curLen++;
                seen[(int)s.charAt(curIndex)]++;
                curIndex++;
                // System.out.println(curLen);
                
            }
            
            Arrays.fill(seen,0);
            
            ans=curLen>ans ? curLen : ans;
            
        }
        
        return ans;
        
    }
}

// Took reference from github.
// Can also be done using arraylist

class Solution {

 public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, max = 0;
        boolean[] window = new boolean[256];
        while(r<s.length()) {
            char c = s.charAt(r);
            while(window[c]) {
                max = Math.max(max, r-l);
                window[s.charAt(l)]=false;
                l++;    
            }
            window[c] = true;
            r++;
        }
        return Math.max(max,r-l);
 }
}