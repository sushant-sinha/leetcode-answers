// SUSHANT SINHA

// 9ms ( 19.34% ) 39.3mb ( 38.75% )
// using lambda expression for testing whether the string is a number or not

class Solution {
    public boolean areNumbersAscending(String s) {
        
        int temp=-1;
        
        for(String a:s.split(" ")){
            
            //lambda expression for testing whether the string contains all digits or not
            //boolean isNumeric = a.chars().allMatch( Character::isDigit );
            //System.out.println(isNumeric);
            
            if(a.chars().allMatch( Character::isDigit )){
                int n=Integer.parseInt(a);
                
                if(temp<n)
                    temp=n;
                else
                    return false;
                
            }
            
        }
        
        return true;
        
    }
}