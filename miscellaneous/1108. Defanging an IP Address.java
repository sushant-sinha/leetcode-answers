// SUSHANT SINHA

// my solution 5ms ( 11.23% )

// cannot use "." in split... 🤔

class Solution {
    public String defangIPaddr(String address) {
        
        String ar[]=address.split("");
        
        
        
        String ans="";
        
        for(String x:ar){
            
            if(x.equals("."))ans+="[.]";
            else ans+=x;
            
        }
        
        return ans;
        
    }
}
