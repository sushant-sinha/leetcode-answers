// SUSHANT SINHA

// 2ms ( 51.31% ) 39mb ( 25.80% )

class Solution {
    public String freqAlphabets(String s) {
        
        String ans="";
        
        for(int i=s.length()-1; i>=0 ;i--){
            if(s.charAt(i)=='#'){
                
                int x=Integer.parseInt(s.substring(i-2,i))+96;
                char temp=(char)x;
                ans+=Character.valueOf(temp);
                i-=2;
                
            }
            else{
                
                int x=Integer.parseInt(s.substring(i,i+1))+96;
                char temp=(char)x;
                ans+=Character.valueOf(temp);
                
            }
        }
        
        String print="";
        
        for(int i=ans.length()-1;i>=0;--i)
            print+=ans.substring(i,i+1);
        
        return print;
        
    }
}

// using StringBuilder
// 1ms ( 77.21% ) 37.2mb ( 82.64% )

class Solution {
    public String freqAlphabets(String s) {
        
        StringBuilder sb1 = new StringBuilder();
        
        for(int i=s.length()-1; i>=0 ;i--){
            if(s.charAt(i)=='#'){
                
                char temp=(char)(Integer.parseInt(s.substring(i-2,i))+96);
                sb1.append(temp);
                i-=2;
                
            }
            else{
                
                char temp=(char)(Integer.parseInt(s.substring(i,i+1))+96);
                sb1.append(temp);
                
            }
        }
        
        sb1.reverse();
        
        return sb1.toString();
        
    }
}