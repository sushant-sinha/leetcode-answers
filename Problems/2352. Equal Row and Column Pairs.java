// SUSHANT SINHA

// 86ms ( 37.76% ) 72.4mb ( 22.68% )

class Solution {
    public int equalPairs(int[][] grid) {
        
        int n=grid.length, ans=0;
        
        // using HasHMap instead of an ArrayList... because there is a chance of multiple instance/occurences of a given col/row...
        // therefore the frequency of the cols=umns should be tracked.
        HashMap<String, Integer> col=new HashMap<>();
        
        for(int i=0;i<n;i++){
            
            int c[]=new int[n];
            
            for(int j=0;j<n;j++){
                c[j]=grid[j][i];
            }
            
            String temp=Arrays.toString(c);
            // System.out.println(temp);
            
            if(col.containsKey(temp))
                col.put(temp, (int)col.get(temp)+1);
            
            else
                col.put(temp, 1);
            
            
        }
        
        for(int i[]:grid){
            
//             System.out.println(Arrays.toString(i));
            
//             System.out.println(col.containsKey(Arrays.toString(i)));
            
            if(col.containsKey(Arrays.toString(i)))
                ans+=col.get(Arrays.toString(i));
            
        }
        
        
        return ans;
        
    }
}