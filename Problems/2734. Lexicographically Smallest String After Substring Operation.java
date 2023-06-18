// SUSHANT SINHA

// 1600ms ( 5.5% ) 49.4mb ( 12.24% )

// very inefficient code..... maybe due to string concatenation

class Solution {
    public String smallestString(String s) {
        
        StringBuffer sb=new StringBuffer(s);
        
        int i=0, j=0;
        
        for(;i<s.length();i++){
            
            if(s.charAt(i)>'a'){
                for(j=i;j<s.length();j++){
                    if(s.charAt(j)=='a')
                        break;
                }
                break;
            }
            
        }
        
        // System.out.println(i+" "+j);
        
        
//         case when there is no possibility of making it lexicographically
        if(i==s.length() && j==0){
            if(s.charAt(i-1)=='a')
            sb.replace(s.length()-1, s.length(), "z");
            
            else{
                sb.replace(s.length()-1, s.length(), ""+((char)(s.charAt(i-1)-1)));
            }
            
            return sb.toString();
        }
        
        for(;i<j;i++){
            // System.out.println(s.charAt(i)+" "+""+((char)(s.charAt(i)-1)));
            sb.replace(i, i+1, ""+((char)(s.charAt(i)-1)));
        }
        
        return sb.toString();
        
    }
}