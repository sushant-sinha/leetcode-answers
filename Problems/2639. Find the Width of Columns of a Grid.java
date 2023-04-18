class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int ans[]= new int[grid[0].length];
        
        for(int i=0;i<ans.length;i++){
            
            int maxLen=0;
            
            for(int j=0;j<grid.length;j++){
                
                if((""+grid[j][i]).length()>maxLen)
                    maxLen=(""+grid[j][i]).length();
                
            }
            
            ans[i]=maxLen;
            
        }
        
        return ans;
        
    }
}