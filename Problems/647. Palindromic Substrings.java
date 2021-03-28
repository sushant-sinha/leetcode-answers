// SUSHANT SINHA

// 482ms ( 6.56% ) 39.5mb ( 20.30% )

class Solution {
    public int countSubstrings(String s) {
        
        int ans=0;
        
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                if(check(s.substring(i,j))){
                    ans++;
                    
                }
            }
        }
        
        return ans;
        
        
    }
    
    boolean check(String s){
        
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        
        return true;
    }
    
}

// india coder solution

class Solution {
    // TC : O(2*O(n2))

    // SC : O(1)
    public int countSubstrings(String s) {

        int totalCount = 0;
        for(int i=0;i<s.length();i++){
            totalCount += getCountOfPalindromicSubstring(i,i, s);   // aba

            totalCount += getCountOfPalindromicSubstring(i,i+1, s); // abba

        }

        return totalCount;
    }

    private int getCountOfPalindromicSubstring(int start, int end, String s ){
        int tCount = 0;
        // O(n)
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
            tCount++;
        }

        return tCount;
    }


}
