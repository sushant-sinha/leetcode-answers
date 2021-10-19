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

// best solution from the submission tab

// 0ms ( 100% )

class Solution {
    public boolean areNumbersAscending(String s) {
        var index = 0;
        var prev = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                var curr = 0;
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    curr = curr * 10 + (s.charAt(index) - '0');
                    index++;
                }
                if (curr <= prev)
                    return false;
                prev = curr;
            }
            index++;
        }
        return true;
    }
}