// SUSHANT SINHA

// 3ms ( 97.97% ) 43.5mb ( 94.7% )

class Solution {
    public String finalString(String s) {
        
        StringBuffer sb=new StringBuffer();
        for(char c:s.toCharArray()){
            if(c=='i'){
                sb.reverse();
            }
            else{
                sb.append(c);
            }
        }
        
        return sb.toString();
        
    }
}