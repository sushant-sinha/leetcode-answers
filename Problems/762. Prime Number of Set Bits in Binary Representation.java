// SUSHANT SINHA

// 112ms ( 12.83% ) 35.7mb ( 84.57% )

class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int prime[]={2,3,5,7,11,13,17,19};
        
        int ans=0;
        
        while(left!=right+1){
            
            int c=isPrime(left);
            
            for(int i:prime){
                if(i==c){
                    ans++;
                    break;
                }
            }
            
            left++;
        }
        
        return ans;
        
    }
    
    int isPrime(int n){        
        int one=0;
        
        while(n!=0){
            if(n%2==1)
                one++;
            n/=2;
        }
        
        return one;
        
    }
}


// more efficient method of finding ones is used

// 8ms ( 64.73% ) 35.6mb ( 84.57% )

class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int prime[]={2,3,5,7,11,13,17,19};
        
        int ans=0;
        
        while(left!=right+1){
            
            int c=isPrime(left);
            
            for(int i:prime){
                if(i==c){
                    ans++;
                    break;
                }
            }
            
            left++;
        }
        
        return ans;
        
    }
    
    int isPrime(int n){        
        int one=0;
        
        while(n!=0){
            one++;
            n&=(n-1);
        }
        
        return one;
        
    }
}