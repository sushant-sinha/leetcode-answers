// SUSHANT SINHA

// 0ms ( 100% ) 41.6mb ( 50.00% )

class Solution {
    public int percentageLetter(String s, char letter) {
        
        int counter=0;
        
        for(char c:s.toCharArray())
            if(c==letter)
                counter++;
        
        return counter*100/s.length();
        
    }
}