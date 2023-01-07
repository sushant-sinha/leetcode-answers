class Solution {
    public int countDigits(int num) {
        
        int ans=0, div=num;
        
        while(div!=0){
            
            if(num%(div%10)==0)
                ans++;
            
            div=div/10;
            
        }
        
        return ans;
        
    }
}