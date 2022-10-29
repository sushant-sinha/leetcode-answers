class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        // brute forcing all the combinations
        
        for(int i=0;i<=num;i++){
            
            //System.out.println(i+" "+rev(i));
            
            if(i+rev(i)==num)
                return true;
            
        }
        
        return false;
        
    }
    
    int rev(int n){
        
        int ans=0;
        
        while(n!=0){
            
            ans=(ans*10)+(n%10);
            n/=10;
            
        }
        
        return ans;
        
    }
}