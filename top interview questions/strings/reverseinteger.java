// SUSHANT SINHA
class Solution {
    public int reverse(int x) {
        
        int len=0,ans=x;
        while(ans!=0){len++;ans=ans/10;}
        for(int i=0;i<len;i++){
            int temp=x%10;x=x/10;
            ans+=temp*Math.pow(10,(len-i-1));
            
        }
        if(ans==(Math.pow(2,31)-1) || ans==Math.pow(-2,31))return 0;
        return ans;
    }
}