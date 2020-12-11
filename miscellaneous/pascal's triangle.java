// SUSHANT SINHA

class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>(1);
        if(n==0)return ans;
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp1=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                temp1.add(binomialCoeff(i,j));
            }
            ans.add(temp1);
        }
        
        return ans;
    }
    static int binomialCoeff(int n, int k) 
    { 
        int res = 1; 
          
        if (k > n - k) 
        k = n - k; 
              
        for (int i = 0; i < k; ++i) 
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        return res; 
    } 
}