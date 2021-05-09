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


// slow but better memory usage
// 11ms ( 42.39% ) 38.5mb ( 98.78% )

class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> list = new LinkedList();
        for(int i = 1; i <=m; i++){
            list.add(i);   
        }
        
        int[] ans = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int val = queries[i],
                index = list.indexOf(val);
            list.remove(index);
            list.add(0, val);
            ans[i] = index;
        }
        System.gc();
        return ans;
    }
}