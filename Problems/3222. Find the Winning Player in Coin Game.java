class Solution {

    public String losingPlayer(int x, int y) {

        y/=4;

        int numberOfTurns=Math.min(x,y);

        return numberOfTurns%2==0 ? "Bob" : "Alice";
        
    }
}