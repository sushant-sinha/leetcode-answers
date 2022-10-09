// SUSHANT SINHA

// 1ms ( 80% ) 41mb ( 48.97% )

class Solution {
    public int commonFactors(int a, int b) {
        
        int ans=0;
        
        HashSet<Integer> factors=new HashSet<>();
        
        for(int i=1; i<=Math.sqrt(b); i++){
            
            if(b%i==0){
                factors.add(i);
                factors.add(b/i);
            }
            
        }
        
        //System.out.println(factors);
        
        for(int i=1; i<=Math.sqrt(a); i++){
            
            if(a%i==0 && factors.contains(i))
                ans++;
            
            if( a%i==0 && factors.contains(a/i) && ((a/i)!=i)  )
                ans++;
            
        }
        
        return ans;
        
    }
}