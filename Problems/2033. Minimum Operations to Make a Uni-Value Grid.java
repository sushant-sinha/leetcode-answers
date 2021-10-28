class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int[] ar= new int[grid.length*grid[0].length];

        int index=-1,ans=0;
        
        for (int i=0;i<grid.length;i++){

            for (int j=0;j<grid[0].length;j++)
                ar[++index]=grid[i][j];

        }
        
        Arrays.sort(ar);

        int median = ar[(ar.length - 1) / 2];
        
        for (int i:ar){
            
            if (i==median)
                continue;
            
            if (Math.abs(i-median)%x !=0)
                return -1;
            
            ans+=Math.abs(i-median)/x;
        }
        
        return ans;
    }
}