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

// best solution 0 ms

class Solution {
    public String thousandSeparator(int n) {
        String orig = String.valueOf(n);
        if (n < 1000) return orig;
        StringBuilder sb = new StringBuilder();
        int sepLen = 3;
        for (int i = orig.length()-1; i >= 0; --i) {
            sb.append(orig.charAt(i));
            --sepLen;
            if (sepLen == 0 && i != 0) {
                sepLen = 3;
                sb.append('.');
            }
        }
        return sb.reverse().toString();
    }
}