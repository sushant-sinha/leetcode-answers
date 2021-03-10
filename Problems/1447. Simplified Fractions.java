// SUSHANT SINHA

// My solution
// 1343ms ( 5.22% ) 39.7mb ( 76.49% )

class Solution {
    public List<String> simplifiedFractions(int n) {
        
        ArrayList<String> ans=new ArrayList<>();
        ArrayList<Float> already=new ArrayList<>();
        
        if(n==1) return ans;
        
        for(int i=1;i<n;i++){
            
            for(int j=i+1;j<=n;j++){
                
                
                float d=(float)i/j;
                if(already.contains(d))continue;
                
                already.add(d);
                ans.add(i+"/"+j);
                
            }
            
        }
        
        return ans;
        
    }
}

// took from discussion tab
// 19ms 39.7

class Solution {
    public List<String> simplifiedFractions(int n) {
        int max=0;
        List<String> ans=new ArrayList();
        if (n==1) return ans;
        for (int i=2;i<=n;i++){
            for (int j=1;j<i;j++){
                max=maxCommonDivisor(i,j);
                if (max==1) ans.add(j+"/"+i);
            }
        }
        return ans;
    }
    private int maxCommonDivisor(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0) {
			return n;
		} else { 
			return maxCommonDivisor(n, m % n);
		}
	}
}