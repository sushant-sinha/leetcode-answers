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

// best solution from submission details ( innovative )


// 0ms ( 100% ) 35.5mb ( 93.84% )

class Solution {

    // for square triples "a^2 + b^2 = c^2" (where c<=250), get
    // all possible c from https://www.mathsisfun.com/numbers/pythagorean-triples.html
    
    final static int [] tripleC={
        5, 13, 17, 25, 29, 37, 41, 53,61, 65,65,73,85,85, 89,97, 101,109,113, 125,137,
        145,145,149,157,169,173,181, 185,185,193,197,205,205,221,221,229,233,241
    };
    
    public int countTriples(int n) {
        int ct=0;
        for ( int c:tripleC )
            if (c>n)
                break;
            else
                ct += 2*(n/c);
        return ct;
        
    }
}