class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        if(x==100)
            return 1;

        return ( x%(x%10+x/10)==0 ) ? (x%10+x/10) : -1;
        
    }
}