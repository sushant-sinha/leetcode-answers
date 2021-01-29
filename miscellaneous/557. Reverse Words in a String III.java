// SUSHANT SINHA

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