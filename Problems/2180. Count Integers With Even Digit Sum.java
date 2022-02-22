class Solution {
    public int countEven(int num) {
        
        int ans=0, sum=0;
        
        for(int i=2;i<=num;i++){
            
            sum=add(i);
            
            if(sum%2==0)
                ans++;
            
        }
        
        return ans;

        /*

        using while loop (no need of 'sum' variable)

        while(num!=1){
            
            if(add(num)%2==0)
                ans++;
            
            num--;
            
        }
        
        return ans;

        */
        
    }
    
    int add(int n){
        
        int sum=0;
        
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        
        return sum;
        
    }
}
