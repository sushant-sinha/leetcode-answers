// SUSHANT SINHA


class Solution {
    public int numberOfSteps (int num) {

        if(num==0) return 0;
        
        int ans=1;
        
        while(num!=1){
            
            num = num%2==0 ? num/2 : --num;
            
            ans++;
            
        }
        
        return ans;
        
    }
}