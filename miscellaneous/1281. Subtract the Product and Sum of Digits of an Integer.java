// SUSHANT SINHA

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