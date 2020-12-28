// SUSHANT SINHA

class Solution {
    public int maximum69Number (int num) {
        
        StringBuffer sb=new StringBuffer(""+num);
        
        for(int i=0;i<sb.length();i++){
            
            if(sb.charAt(i)!='9')
            {
                sb.replace(i,i+1,"9");
                break;
            }
            
        }
        
        System.out.println(sb);
        
        return Integer.valueOf(sb.toString());
        
    }
}