// SUSHANT SINHA

// 9ms ( 7.50% ) 39.7mb ( 8.94% )
// basic

class Solution {
    public String reversePrefix(String word, char ch) {
        
        int n=word.indexOf(ch);
        
        if(n==-1)
            return word;
        
        String temp="";
        
        for(int i=n;i>=0;i--){
            temp+=word.charAt(i);
        }
        
        return temp+word.substring(n+1);
        
    }
}