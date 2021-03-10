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

// other short method

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> result = new ArrayList<>();
//         for (int i = 0; i < numRows; i++) {
//             List<Integer> row = new ArrayList<>();
//             row.add(1);
//             for (int j = 1; j < i; j++) {
//                 List<Integer> upper = result.get(i-1);
//                 row.add(upper.get(j-1) + upper.get(j));
//             }
//             if (i > 0) row.add(1);
//             result.add(row);
//         }
//         return result;
//     }
// }
