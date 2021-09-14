// SUSHANT SINHA

// 1ms ( 73.36% ) 38.7mb ( 83.93% )
// using StringBuffer's inbuilt function for reversing the splitted string

class Solution {
    public String reversePrefix(String word, char ch) {
        
        int n=word.indexOf(ch);
        
        if(n==-1)
            return word;
        
        StringBuffer sb=new StringBuffer();
        sb.append(word.substring(0,n+1));
        
        sb.reverse();
        
        // for(int i=n;i>=0;i--){
        //     temp+=word.charAt(i);
        // }
        
        return sb+word.substring(n+1);
        
    }
}

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