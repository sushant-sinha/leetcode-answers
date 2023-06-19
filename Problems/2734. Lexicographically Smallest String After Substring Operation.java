// SUSHANT SINHA

// 26ms ( 36.84% ) 47.7mb ( 90.44% )

class Solution {
    public String smallestString(String s) {
        
        StringBuffer sb=new StringBuffer(s);
        char ar[]=s.toCharArray();
        
        int i=0, j=0;
        
        for(;i<s.length();i++){
            
            if(s.charAt(i)>'a'){
                for(j=i;j<s.length();j++){
                    
                    if(s.charAt(j)=='a')
                        break;

                    ar[j]=(char)(ar[j]-1);
                }
                break;
            }
            
        }

        if(i==s.length() && j==0){
            if(s.charAt(i-1)=='a')
            ar[s.length()-1]= 'z';

            else{
                ar[s.length()-1]=(char)(ar[s.length()-1]-1);
            }
            
            // return sb.toString();
        }
        
        return String.valueOf(ar);
        
    }
}