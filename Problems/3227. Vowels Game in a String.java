// SUSHANT SINHA

// 6ms ( 90.20% ) 45.29mb ( 96.39% )

class Solution {
    public boolean doesAliceWin(String s) {
        
        int vowCount=0;

        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vowCount++;
        }

        if(vowCount==0)
            return false;

        else
            return true;
    }
}