// SUSHANT SINHA

// 2ms ( 75.00% ) 41.2mb ( 25.00% )

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

// best solution from the submission tab
// 0ms ( 100% )

class Solution {
    public int countEven(int num) {
        if (num < 10)
            return num / 2;
        
        // important
        int tens = num / 10 - 1;
        int result = 4 + 5*tens;
        int left = num % 10;
        
        int sum = 0;
        
        tens = num / 10;
        
        while (tens != 0){
            sum += tens % 10;
            tens /= 10;
        }
        
        if (sum % 2 != 0)
            result += (left + 1) / 2;
        else
            result += 1 + left / 2;
        
        return result;
    }
}