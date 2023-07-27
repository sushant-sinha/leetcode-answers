// SUSHANT SINHA

// 0ms ( 100% ) 40.3mb ( 98.35% )

class Solution {
    public double myPow(double x, int n) {
        
        if(n==0)
            return 1;

        if(n==-1)
            return 1/x;
        
        if(n==1)
            return x;

        long pow=n;

        pow*=pow<0 ? -1 : 1;

        pow-=pow%2!=0 ? 1 : 0;
        
        double temp=helper(x,pow);

        if(n<0)
            temp=1/temp;

        if(n%2!=0){

            if(n>0)
                temp*=x;

            else if(n<0){
                temp=temp/x;
            }

        }

        return temp;
    }

    double helper(double base, long pow){

        // System.out.println("for pow="+pow);

        if(pow==1)
            return base;

        if(pow%2!=0)
            return base * helper(base*base, pow/2); //* helper(base, pow/2);
        
        else
            return helper(base*base, pow/2);// * helper(base, pow/2);
    }

}