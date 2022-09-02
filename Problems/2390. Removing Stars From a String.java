// SUSHANT SINHA

// 206ms ( 52.19% ) 43mb ( 97.80% )

class Solution {
    public String removeStars(String s) {
        
        //int star=0;
        
        //int deleted=0;
        StringBuffer sbuf=new StringBuffer();
        
        for(int i=0;i<s.length();i++){
            
            sbuf.append(s.charAt(i));
            
            if(s.charAt(i)=='*'){
                sbuf.deleteCharAt(sbuf.length()-1);
                sbuf.deleteCharAt(sbuf.length()-1);
            }
            
            //deleted+=2;
                
            
        }
        
        //System.out.println(sbuf);
        
        return sbuf.toString();
        
    }
}