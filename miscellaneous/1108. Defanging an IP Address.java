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

// best solution 0ms (using replace)

class Solution {
    public String defangIPaddr(String address) {
        String newAddress = address.replace(".", "[.]");
        return newAddress;
    }
}

// solution using stringbuilder 1ms

class Solution {
    public String defangIPaddr(String address) {
        String[] addr = address.split("\\.");
        StringBuilder sb = new StringBuilder(addr[0]);
        for(int i = 1; i < addr.length; i++) {
            sb.append("[.]" + addr[i]);
        }

        return sb.toString();
    }
}