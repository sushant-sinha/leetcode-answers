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


// 0ms ( 100% ) 37.1mb ( understand the missed part )

class Solution {
    
    public List<String> printVertically(String s) {
        String [] ss=s.split(" ");
        
        int longest=0;
        //find the current longest wordlength.
        for(String e :ss){
        longest=Math.max(longest,e.length());
        }
          
        
        List<String> ret=new ArrayList<>();
       StringBuilder t=new StringBuilder();
         
         for(int i=0;i<longest;i++){
             int missed=0;
             
        for(int j=0;j<ss.length;j++){ 
            
             if(i<ss[j].length()){
                
                while(missed>0){
                    t.append(' ');
                    --missed;
                }
                
                t.append(ss[j].charAt(i));
            } else {
                missed++;
            }
             
        } 
             ret.add(t.toString());
             // string builder can be reused.
             t.setLength(0);
          }
        
         
        return ret; 
    }
}