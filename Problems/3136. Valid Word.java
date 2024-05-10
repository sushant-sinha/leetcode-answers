// SUSHANT SINHA

// 1ms ( 99.32% ) 41.77mb ( 82.74% )

// very low acceptance rate for this question... has no hidden tricks that can fail the test case

class Solution {
    public boolean isValid(String word) {

        if(word.length()<3)
            return false;

        int vowCount=0, consCount=0;

        for(char c: word.toCharArray()){

            if(Character.isDigit(c))
                continue;

            if(Character.isLetter(c)){
                if(isVow(Character.toLowerCase(c)))
                    vowCount++;
                else
                    consCount++;
            }

            else{
                return false;
            }
        }

        return consCount>0 && vowCount>0;
        
    }

    boolean isVow(char c){

        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}