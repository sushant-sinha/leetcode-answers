class Solution {
    public int countValidWords(String sentence) {
        
        String ar[]=sentence.trim().split("\\s+");
        
        // for(String s:ar)
        //     System.out.println(s);
        
        int ans=0;
        
        for(int i=0;i<ar.length;i++){
            
            if(isValid(ar[i]))
                ans++;
            
        }
        
        return ans;
        
    }
    
    static boolean isValid(String s){
        
        //int ex=0,hyphen=0,com=0,number=0;
        
        int hyphen=0;
        
        // if(s==' ')
        //     System.out.println(s);
        
        for(int i=0;i<s.length();i++){
            
            //System.out.println(s.charAt(i));
            
            if(Character.isDigit(s.charAt(i)))
                return false;
            
            else if((s.charAt(i)=='!' || s.charAt(i)==',' || s.charAt(i)=='.') && (i+1)!=s.length())
                return false;
            
            else if(s.charAt(i)=='-'){
                
                if((i-1)<0 || (i+1)==s.length() || !Character.isLetter(s.charAt(i-1)) || !Character.isLetter(s.charAt(i+1)))
                    return false;
                else
                    hyphen++;
                
                if(hyphen>1)
                    return false;
                
            }
            
        }
        
        
        return true;
        
    }
}