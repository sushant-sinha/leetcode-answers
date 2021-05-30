// SUSHANT SINHA

// using string to get the integer.... and then converting this string into Integer
// 5ms 37.4mb

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return convert(firstWord)+convert(secondWord)==convert(targetWord);
        
    }

    static int convert(String s){

        String s1="";
        for(char c:s.toCharArray()){

            s1+=""+(int)(c-'a');

        }


        return Integer.parseInt(s1);


    }
}

// get the integer value directly........... no need of using a String
// 0ms ( 100% ) 37.3mb

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return convert(firstWord)+convert(secondWord)==convert(targetWord);
        
    }

    static int convert(String s){

        int ans=0;

        for(char c:s.toCharArray()){

            ans = (ans*10) + (c-'a');

        }


        return ans;


    }
}