// SUSHANT SINHA

// 1ms ( 89.30% ) 36.6mb ( 96.69% )

class Solution {
    public String sortSentence(String s) {
        
        String split[]=s.split(" ");
        String ans[]=new String[split.length];
        
        for(String c:split){
            
            int i=Integer.parseInt(c.substring(c.length()-1,c.length()));
            
            ans[i-1]=c.substring(0,c.length()-1);
            
        }
                
        return String.join(" ",ans);
        
    }
}