// TLE because of the overhead of checking every number between x and 2*x
// we are sure that the n+1th ugly number is going to be 2*x (where x is the nth smallest ugly number)
class Solution {

    HashSet<Integer> isUgly=new HashSet<>();

    public int nthUglyNumber(int n) {

        if(n==1)
            return 1;

        int counter=1, cur=1;

        while(counter!=n){
            
            cur++;

            if(checkUgly(cur)){
                counter++;
                isUgly.add(cur);
            }
        }

        return cur;
        
    }

    boolean checkUgly(int n){

        while(n!=1){

            boolean divisible=false;

            if(n%2==0){
                divisible=true;
                n/=2;
                if(isUgly.contains(n))
                    return true;
            }

            if(n%3==0){
                divisible=true;
                n/=3;
                if(isUgly.contains(n))
                    return true;
            }

            if(n%5==0){
                divisible=true;
                n/=5;
                if(isUgly.contains(n))
                    return true;
            }

            if(!divisible)
                return false;

        }

        return true;
    }
}