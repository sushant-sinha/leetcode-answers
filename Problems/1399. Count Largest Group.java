// SUSHANT SINHA

// 3ms ( 97.38% ) 35.6mb ( 91.33% )

class Solution {
    public int countLargestGroup(int n) {
        
        int ar[]= new int[37];

        for(int i=1;i<=n;i++)
            ar[sum(i)-1]++;
        
        int max=0,ans=0;
        
        for(int i:ar)
            max = max > i ? max : i;
        
        for(int i:ar)
            ans+= max==i ? 1 : 0;
            

        return ans;
        
    }

    int sum( int n ){

        int sum=0;

        while(n!=0){
            sum+=n%10;
            n/=10;
        }

        return sum;
    }
}