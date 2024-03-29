// SUSHANT SINHA

// 1ms ( 88.64% ) 42.4mb ( 13.64% )
// the below solution is made way more complex than it should be

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        
        boolean ans[]=new boolean[4];
        
        if(password.length()<8)
            return false;
        
        for(int i=0;i<password.length()-1;i++){
            
            if(password.charAt(i)==password.charAt(i+1))
                return false;
            
            int condition=helper(password.charAt(i));
            
            if(condition==4)
                return false;
            
            ans[condition]=true;
            
        }
        
        // checking the condition for the last element
        
        if(helper(password.charAt(password.length()-1)) ==4 )
            return false;
        
        else
            ans[helper(password.charAt(password.length()-1))]=true;
        
        for(boolean b:ans)
            if(!b)
                return false;
        
        return true;
        
    }
    
    int helper(char c){
        
        char special[]=new char[]{'!','@','#','$','%','^','&','*','(',')','-','+'};
            
        if(c>=65 && c<=90)
            return 1;

        if(c>=97 && c<=122)
            return 0;

        if(c>=48 && c<=57)
            return 2;

        boolean specChar=false;
            
        for(char s:special)
            if(s==c)
                return 3;
        
        return 4;
        
    }
}

// 0ms

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean len=password.length()>7;
        boolean low=false,hi=false,dig=false,sp=false,adj=false;
        
        int i,n=password.length();
        String special="!@#$%^&*()-+";
        for(i=0;i<n;i++)
        {
            char c=password.charAt(i);
            if(c>='a' && c<='z') low=true;
            else if(c>='A' & c<='Z') hi=true;
            else if(c>='0' & c<='9') dig=true;
            else sp=true;
            if(i>0 && password.charAt(i-1)==c) adj=true;
        }
        return len & low & hi & dig & sp & !adj;
    }
}