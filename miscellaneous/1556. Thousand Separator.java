// SUSHANT SINHA

// my solution 3ms ( 32.15% )

class Solution {
    public String thousandSeparator(int n) {
        
        String s="";
        String sp[]=String.valueOf(n).split("");
        
        for(int i=0;i<sp.length;i++){
            
            if(i>0 && (sp.length-i)%3==0)s+=".";
            s+=sp[i];
            
        }
        
        return s;
        
    }
}

