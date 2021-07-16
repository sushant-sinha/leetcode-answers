// SUSHANT SINHA

// 2ms ( 69.54% ) 36mb ( 67.02% ) 

class Solution {
    public int findTheWinner(int n, int k) {
        
        ArrayList<Integer> pl=new ArrayList<>();
        
        for(int i=1;i<=n;i++)
            pl.add(i);        
        
        int start=0;
        
        while(pl.size()!=1){
            
            int x=(start+k-1)%pl.size();
            pl.remove(x);
            start=x%pl.size();
            
        }
        
        return pl.get(0);
        
    }
}