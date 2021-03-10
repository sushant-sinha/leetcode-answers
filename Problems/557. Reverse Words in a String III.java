// SUSHANT SINHA

// 16ms ( 23.49% ) 40.6mb ( 17.10% )

class Solution {
    public String reverseWords(String s) {
        
        String split[]=s.split(" ");
        String ans="";
        for(int i=0;i<split.length;i++){
            
            StringBuffer sb=new StringBuffer(split[i]);
            sb.reverse();
            ans+=" "+sb;
            
        }
        return ans.substring(1,ans.length());
        
    }
}