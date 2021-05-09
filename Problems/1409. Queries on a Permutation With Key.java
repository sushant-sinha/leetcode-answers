// SUSHANT SINHA

// using arraylist
// 6ms ( 82.35% ) 39mb ( 69.37% )

class Solution {
    public int[] processQueries(int[] queries, int m) {
        
        ArrayList<Integer> p = new ArrayList<>();
        
        for(int i=1;i<=m;i++)
            p.add(i);
        
        int ans[]=new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            
            for(int j=0;j<p.size();j++){
                
                if(p.get(j)==queries[i]){
                    
                    ans[i]=j;
                    p.remove(j);
                    p.add(0,queries[i]);
                    break;
                    
                }
                
                
            }
            
        }
        
        return ans;
        
    }
}
