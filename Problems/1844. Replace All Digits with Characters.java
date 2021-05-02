// SUSHANT SINHA

// 0ms ( 100% ) 37.4mb ( 100% )

class Solution {
    public String replaceDigits(String s) {
        
        char ar[]=s.toCharArray();
        
        for(int i=1;i<s.length();i+=2){
            
            ar[i]=(char)(ar[i-1]+Character.getNumericValue(ar[i]));
            
        }
        
        
        return String.valueOf(ar);
        
    }
}