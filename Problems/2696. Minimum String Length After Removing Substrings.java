class Solution {
    public int minLength(String s) {
        
        StringBuffer sb=new StringBuffer(s);
        
        boolean flag=true;
        
        while(flag){
            
            flag=false;
            
            int index=sb.indexOf("AB");
            
            if(index>-1){
                sb.delete(index,index+2);
                flag=true;
            }
            
            else{
                
                index=sb.indexOf("CD");
                if(index>-1){
                    sb.delete(index,index+2);
                    flag=true;
                }
                
            }
            
            // System.out.println(sb);
            
        }
        
        return sb.length();
        
    }
}