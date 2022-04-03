// SUSHANT SINHA

// 8ms ( 80.00% ) 42.7mb ( 92.22% )

class Solution {
    public boolean validPalindrome(String s) {
        
        // using this variable for atmost one deletion
        boolean deletedOnce=false;
        
        int front=0, back=s.length()-1;
        
        while(front<back){
            
            if(s.charAt(front)!=s.charAt(back)){
                
                // System.out.println(s.charAt(front)+" "+s.charAt(back));
                // System.out.println(palindromeChecker(s.substring(front,back)));
                
                // System.out.println("in");
                
                if(deletedOnce)
                    return false;
                
                // System.out.println(s.substring(front+1,back+1));
                // System.out.println(s.substring(front,back));
                
                // deleting from front
                if(palindromeChecker(s.substring(front+1,back+1))){
                    
                    deletedOnce=true;
                    front++;
                    // System.out.println(s.charAt(front)+" "+s.charAt(back));
                }
                
                // deleting from back
                else if(palindromeChecker(s.substring(front,back))){
                    
                    deletedOnce=true;
                    back--;
                    // System.out.println(s.charAt(front)+" "+s.charAt(back));
                }
                
                // palindrome not possible
                else
                    return false;
                
            }
            
            front++;
            back--;
            
        }
        
        return true;
        
    }
    
    boolean palindromeChecker(String x){
        
        for(int i=0;i<x.length()/2;i++){
            if(x.charAt(i)!=x.charAt(x.length()-i-1))
                return false;
        }
        
        return true;
        
    }
}