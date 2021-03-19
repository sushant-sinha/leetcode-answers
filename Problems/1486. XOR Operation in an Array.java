// SUSHANT SINHA

// 0ms ( 100% ) 35.4mb ( 91.85% )

class Solution {
    public int xorOperation(int n, int start) {
        
        int ans=start;
        
        for(int i=1;i<n;i++){
            ans^=(start+2*i);
        }
        
        return ans;

        /*
			or use
			int ans=start;
        
        	while((--n)!=0)
            	ans^=(start+2*n);
        
        	return ans;

        */
        
        
    }
}