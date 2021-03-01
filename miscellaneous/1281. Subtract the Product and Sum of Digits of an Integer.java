// SUSHANT SINHA

// 4ms ( 6.60% ) 35.9mb ( 37.99% )

class Solution {
    public int subtractProductAndSum(int n) {
        
        String num=""+n;
        int pro=1,sum=0;
        for(char x:num.toCharArray()){
            pro*=Character.getNumericValue(x);
            sum+=Character.getNumericValue(x);
        }
        
        return pro-sum;
        
    }
}

// best solution 0ms

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n > 0) {
            int val = n % 10;
            product *= val;
            sum += val;
            n = n / 10;
        }
        return product - sum;
    }
}