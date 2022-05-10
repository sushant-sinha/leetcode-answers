class Solution {
    public String largestGoodInteger(String num) {
        
        String ans="000";
        String sub;
        boolean flag=false;
        
        for(int i=0;i<=num.length()-3;i++){
            
            sub=num.substring(i,i+3);
            
            if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)){
                flag=true;
                if(sub.compareTo(ans)>=0){
                    ans=sub;
                }
            }
            
        }
        
        return flag ? ans : "";
        
    }
}