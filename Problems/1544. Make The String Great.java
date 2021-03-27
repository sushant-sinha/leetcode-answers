// SUSHANT SINHA

// 2ms ( 87.01% ) 38.9mb ( 55.54% )

class Solution {
    public String makeGood(String s) {
        
        while(true){
            
            boolean ck=true;
                        
            for(int i=0;i<s.length()-1;i++){
                
                if(('A'-s.charAt(i))==('a'-s.charAt(i+1)) || ('a'-s.charAt(i))==('A'-s.charAt(i+1))){
                    
                    
                    s=s.substring(0,i)+s.substring(i+2,s.length());
                    ck=false;
                    break;
                }
            }
            
            if(ck)break;
            
        }
        
        return s;
        
    }
}