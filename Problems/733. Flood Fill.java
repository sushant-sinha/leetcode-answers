class Solution {
    
    int[][] ans;
    int m,n;
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        m=image.length;
        n=image[0].length;
        
        // for(int i=0;i<m;i++)
        //     for(int j=0;j<n;j++)
        //         ans[i][j]=image[i][j];
        
        ans=image;
        
        recur(sr, sc, ans[sr][sc], color);
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(image[i][j]==-1)
                    image[i][j]=color;
        
        return image;
        
    }
    
    void recur(int i, int j, int c1, int c2){
        
        if(i>=m || j>=n || i<0 || j<0 || ans[i][j]==-1)
            return;
        
        if(ans[i][j]!=c1)
            return;
        
        if(ans[i][j]==c1)
            ans[i][j]=-1;
        
        recur(i+1,j,c1,c2);
        recur(i,j+1,c1,c2);
        recur(i-1,j,c1,c2);
        recur(i,j-1,c1,c2);
        
    }
    
}