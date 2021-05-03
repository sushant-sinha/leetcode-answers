// SUSHANT SINHA

// 23ms ( 54.73% ) 35.6mb ( 91.31% )

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        int index[]=new int[45];
        
        while(lowLimit<=highLimit){
            index[sum(lowLimit)-1]++;
            lowLimit++;
        }
        
        Arrays.sort(index);
        
        return index[44];
        
    }
    
    int sum(int n){
        
        int ans=0;
        
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        
        return ans;
        
    }
}    
        return ans;
        
    }
}