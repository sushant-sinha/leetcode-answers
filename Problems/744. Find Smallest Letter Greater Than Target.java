// SUSHANT SINHA

// solution without binary search (0 ms 38.8 mb)

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     
        if(target >= letters[letters.length-1])return letters[0];
        
        else{
            for(char x : letters){
                if(x>target)return x;
            }
        }
        
        return '0';
    }
}
