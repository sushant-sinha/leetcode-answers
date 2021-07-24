class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        while(k!=0){
            k--;
            
            int temp=grid[0][0];
            
            for(int i=0;i<grid.length;i++){
                
                int l=grid[i][grid[0].length-1];
                
                for(int j=0;j<grid[0].length;j++){
                    
                    int x=grid[i][j];
                    grid[i][j]=temp;
                    temp=x;                    
                    
                }
                
            }
            
            grid[0][0]=temp;
        }
        
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int a[]:grid){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int b:a){
                temp.add(b);
            }
            ans.add(temp);
        }
        
        return ans;
        
    }
}