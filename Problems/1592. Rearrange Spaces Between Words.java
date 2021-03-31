// SUSHANT SINHA

// 4ms ( 57.42% ) 37.5mb ( 52.04% )

class Solution {
    public String reorderSpaces(String text) {
        
        int space=0;
        for(char x:text.toCharArray())
            if(x==' ')
                ++space;
        
        
        String[] words = text.trim().split("\\s+");
        
        String ans="";
        int ar=0;
        
        if(words.length==1){
            
            ans+=words[0];
            
            while(ans.length()!=text.length())
                ans+=" ";
            
            return ans;
            
        }
        
        int val=(space/(words.length-1));
        int remainder = space%(words.length-1);
        
        for(int i=0;i<space+words.length-remainder;i++){
            
            ans+=words[ar++];
            if(i+1==space+words.length-remainder)
                break;
            for(int j=0;j<val;j++)
                ans+=" ";
            i+=val;
            
        }
        
        
        
        while(ans.length()!=text.length())
            ans+=" ";
        
        return ans;
        
    }
}