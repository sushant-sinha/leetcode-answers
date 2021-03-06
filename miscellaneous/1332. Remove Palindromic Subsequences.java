// SUSHANT SINHA

/*
												IMPORTANT

						Here we just need to check whether the string is palindrome or not...
						If "s" is palindrome we will need 1 attempt to make the string empty...
						Else we can do it in 2 attempt

*/

// 0ms ( 100% ) 36.6mb ( 63.38% )

class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0)return 0;
        if(ispal(s))return 1;
        else return 2;
        
        
    }
    
    public boolean ispal(String s){
        
        for(int i=0;i<s.length()/2;i++){
            
            if(!(s.charAt(i)==s.charAt(s.length()-i-1)))return false;
            
        }
        
        return true;
        
    }
    
}

// for better memory 0ms 36.6mb ( 86.85% )

class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0)return 0;
        return ispal(s) ? 1 : 2;
        
        
    }
    
    public boolean ispal(String s){
        
        for(int i=0;i<s.length()/2;i++){
            
            if(!(s.charAt(i)==s.charAt(s.length()-i-1)))return false;
            
        }
        
        return true;
        
    }
    
}

// realisation of this method from vinsinin using reverse check

class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0)return 0;
        return ispal(s) ? 1 : 2;
        
        
    }
    
    public boolean ispal(String s){
        
        for(int i=0;i<s.length()/2;i++){
            
            if(!(s.charAt(i)==s.charAt(s.length()-i-1)))return false;
            
        }
        
        return true;
        
    }
    
}