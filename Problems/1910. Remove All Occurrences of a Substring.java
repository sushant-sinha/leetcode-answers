// SUSHANT SINHA

class Solution {
    public String removeOccurrences(String s, String part) {
        
        boolean found = true;

        StringBuffer sb=new StringBuffer(s);
        int len=part.length();

        while(found){
            
            found=false;
            
            for(int i=0;sb.length()-i>=len;i++){
                
                String sub=sb.substring(i,i+len);
                
                if(sub.equals(part)){
                    
                    sb.delete(i,i+len);
                    found=true;
                    break;
                    
                }
            }
            
            if(!found)
                break;
        }

        return String.valueOf(sb);
        
    }
}