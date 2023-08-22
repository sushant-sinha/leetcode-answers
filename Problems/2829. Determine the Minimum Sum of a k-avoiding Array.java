class Solution {
    public int minimumSum(int n, int k) {
        
        int ans=0;
        
        ArrayList<Integer> notPossible=new ArrayList<>();
        
        int cur=1;
        
        for(int i=0;i<n;i++){
            
            if(!notPossible.contains(cur)){
                ans+=cur;
                notPossible.add(k-cur);
                
                // System.out.println(cur);
            }
            
            
            else{
                i--;
            }
            cur++;
            
        }
        
        return ans;
        
    }
}