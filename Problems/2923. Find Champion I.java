class Solution {
    public int findChampion(int[][] grid) {
        
        int ar[]=new int[grid.length];
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid.length;j++){
                
                ar[i]+=grid[i][j];
                
            }
        }

        for(int i=0;i<ar.length;i++)
            if(ar[i]==ar.length-1)
                return i;
        
        return 0;
        
    }
}