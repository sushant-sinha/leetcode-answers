// SUSHANT SINHA

// 1ms ( 59.15% ) 37.5mb ( 32.22% )

class Solution {
    public String interpret(String command) {
        
        String ans="";
        
        for(int i=0;i<command.length();i++){

            // condition for "G", "o" and "al"
            
            if(command.charAt(i)=='G')
                ans+="G";
            
            else if(i<command.length()-1 && command.substring(i,i+2).equals("()")){
                ans+="o";
                i++;
            }
            else{
                ans+="al";
                i+=3;
            }
            
            
        }
        
        return ans;
        
    }
}