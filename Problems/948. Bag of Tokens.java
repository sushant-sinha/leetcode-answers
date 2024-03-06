// SUSHANT SINHA

// 4ms ( 9.55% ) 42.49mb ( 85.03% )

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        // A rare constraint that I haven't seen in a long time
        // single handedly failed the submisison 😂
        if(tokens.length==0)
            return 0;

        Arrays.sort(tokens);

        int ans=0;

        int front=0, back=tokens.length-1;

        if(tokens[0]>power)
            return 0;

        while(front!=back+1){

            // System.out.println("front="+front+"  back="+back+" ans="+ans+" power="+power);

            boolean flagFound=false;

            if(power>=tokens[front]){
                power-=tokens[front];
                front++;
                ans++;
                flagFound=true;
            }

            else if(ans>0){

                // is it worth giving the token to gain power which you wont be using anymore as there are no more Face-up moves available
                if(back-front==0)
                    break;

                power+=tokens[back];
                back--;
                ans--;
                flagFound=true;

            }

            if(!flagFound)
                break;

        }

        return ans;
        
    }
}