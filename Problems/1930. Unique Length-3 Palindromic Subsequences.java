// SUSHANT SINHA

/*

    wasnt aware of return string.chars().distinct().count();
    it returns the number of distinct characters in the given string

    found @ https://stackoverflow.com/questions/32113833/how-to-find-number-of-distinct-characters-in-a-string

*/

// 501ms ( 29.61% ) 51.9mb ( 42.52% )

class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int ans=0;
        int full[]=new int[26];
        
        for(int i=0;i<s.length()-2;i++){
            if(full[s.charAt(i)-'a']==1){
                continue;
            }
            
            int j=s.length()-1;
            for(;j>i+1;j--){
                
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                
            }
            
            ans+=s.substring(i+1,j).chars().distinct().count();
            
            full[s.charAt(i)-'a']=1;
            
            if(ans==676)
                return 676;
            
        }
        
        return ans;
        
    }
}