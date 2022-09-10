class Solution {
    
    public boolean isStrictlyPalindromic(int n) {
        
        int num=n;
        
        for(int i=2;i<n-1;i++){
            
            if(!check(num, i))
                return false;
            
        }
        
        return true;
        
    }
    
    boolean check(int num, int base){
        
        StringBuilder temp=new StringBuilder();
        
        while(base<num){
            
            int re=num%base;
            num/=base;
            
            temp.insert(0,re);
            
        }
        
        temp.insert(0,num);
        
        // cheking whether it is a palindrome or not
        // could have used the reverse function...
        // but prefer this as not all elements are needed to be swapped
        // and neither do we have to traverse the entire String
        
        for(int i=0;i<temp.length()/2;i++)
            if(temp.charAt(i)!=temp.charAt(temp.length()-i-1))
                return false;
        
        return true;
        
    }
    
}