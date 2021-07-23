// SUSHANT SINHA

// 6ms ( 95.08% ) 35.4mb ( 99.31% )

class Solution {
    public int countTriples(int n) {
        
        int ans=0;
        
        for(int i=1;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(sq(i,j,n))
                    ans++;
            }
        }
        
        return ans*2;
        
    }
    
    boolean sq(int a, int b, int n){
                
        int s=(int)Math.sqrt((a*a)+(b*b));
                
        return s<=n && (s*s)==((a*a)+(b*b));
        
    }
    
}