// SUSHANT SINHA

// 4ms( 60.14% ) 41.88mb ( 83.03% )

class Solution {
    public char kthCharacter(int k) {

        char c=recur(new StringBuffer("a"), k, 1);

        return c;
        
    }

    char recur(StringBuffer s, int k, int len){

        if(len>=k){
            // System.out.println(s);
            return s.charAt(k-1);
        }

        else{
            for(int i=0;i<len;i++){
                s.append(next(s.charAt(i)));
            }

            return recur(s, k, len*2);
        }
    }

    char next(char c){

        if(c=='z')
            return 'a';

        else
            return (char)((int)(c+1));
    }
}