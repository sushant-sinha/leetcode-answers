// SUSHANT SINHA

// 4ms ( 44.28% ) 37.7mb ( 88.75% )
// using lambda expression for testing whether the string is a number or not

class Solution {
    public boolean areNumbersAscending(String s) {
        
        int temp=-1;
        
        for(String a:s.split(" ")){
            
            //lambda expression for testing whether the string contains all digits or not
            //boolean isNumeric = a.chars().allMatch( Character::isDigit );
            //System.out.println(isNumeric);
            
            if(a.chars().allMatch( Character::isDigit )){
                if(temp<Integer.parseInt(a))
                    temp=Integer.parseInt(a);
                else
                    return false;
                
            }
            
        }
        
        return true;
        
    }
}