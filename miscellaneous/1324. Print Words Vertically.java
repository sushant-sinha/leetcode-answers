// SUSHANT SINHA

// my solution 5ms ( 36.6% ) 38.1mb

class Solution {
    public List<String> printVertically(String s) {
        
        String split[]=s.split(" ");
        int len=0;
        for(String x:split){
            
            len=len>x.length() ? len : x.length();
            
        }
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<len;i++){
            
            String temp="";
            
            for(String x:split){
                
                if(i<x.length())temp+=x.substring(i,i+1);
                else temp+=" ";
                
            }
            String trimed = temp.replaceAll("\\s+$", "");
            ans.add(trimed);

            
        }
        
        
        return ans;
        
        
    }
}