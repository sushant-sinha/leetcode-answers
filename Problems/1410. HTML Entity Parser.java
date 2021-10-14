// SUSHANT SINHA

// 75ms ( 22.43% ) 39.8mb ( 71.96% )

class Solution {
    public String entityParser(String text) {
        
        StringBuilder str=new StringBuilder(text);
        
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='&'){
                
                if(i+4<=str.length()){
                    
                    if(str.substring(i+1,i+4).equals("gt;"))
                        str.replace(i,i+4,">");
                    
                    else if(str.substring(i+1,i+4).equals("lt;"))
                        str.replace(i,i+4,"<");
                    
                    else if(i+5<=str.length() && str.substring(i+1,i+5).equals("amp;"))
                        str.replace(i,i+5,"&");
                    
                    else if(i+6<=str.length() && str.substring(i+1,i+6).equals("quot;"))
                        str.replace(i,i+6,"\"");
                    
                    else if(i+6<=str.length() && str.substring(i+1,i+6).equals("apos;"))
                        str.replace(i,i+6,"'");
                    
                    else if(i+7<=str.length() && str.substring(i+1,i+7).equals("frasl;"))
                        str.replace(i,i+7,"/");
                    
                }
                                
            }
            
        }
        
        //System.out.println(str);
        
        return str.toString();
        
    }
}