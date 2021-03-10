// SUSHANT SINHA

// my solution
// 0ms 38.9mb ( 94.96% )

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        for(int i = 0;i<A.length;i++){
            
            int ar[] = new int[A.length];
            
            int x=0;
            
            for(int j = A.length-1 ; j>=0 ;j--){
                                
                ar[x++] = A[i][j]==1 ? 0 : 1;
                
            }
            
            for(int j=0;j<A.length;j++)
                A[i][j]=ar[j];
            
        }
        
        return A;
        
    }
}

// best solution given
// 0ms 39.4mb ( 33.30% )

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int n = A.length;
        for(int[] row : A){
          for(int i=0; i*2 < n ; i++){
             if(row[i] == row[n-i-1])
                 row[i] = row[n-i-1] ^= 1;
          }
        }
        
        return A;
    }
}