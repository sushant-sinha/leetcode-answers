// SUSHANT SINHA

// 4ms ( 92.12% ) 45.19mb ( 96.84% )

class Solution {
    public boolean doesAliceWin(String s) {
        
        int vowCount=0;

        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                return true;
        }

        // if(vowCount==0)
        //     return false;

        // else
            // return true;
        
        return false;
    }
}