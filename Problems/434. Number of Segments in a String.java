// 0ms ( 100% ) 36.6mb ( 93.57% )
// from https://leetcode.com/problems/number-of-segments-in-a-string/discuss/1530927/java-100-faster

class Solution {
    public int countSegments(String s) {
        
        int ans=0,ind=-2;
        
        char ar[]=s.toCharArray();
        
        for(int i=0;i<ar.length;i++){
            
            if (ar[i]!=' ') {
                if (i!=ind+1)
                    ans++;
                ind=i;
            }
            
        }
        
        return ans;
        
    }
}