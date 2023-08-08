// SUSHANT SINHA

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int midIndex=helper(0, matrix.length-1, matrix, target);

        // System.out.println("------"+midIndex);

        for(int i:matrix[midIndex])
            if(i==target)
                return true;
        
        return false;
    }

    int helper(int start, int end, int[][] matrix, int target){

        if(start==end)
            return start;

        // if the difference between start and end is one... this means there are two rows now left for testing

        if(Math.abs(end-start)==1){
            if(matrix[start][0]<=target && matrix[start][matrix[0].length-1]>=target)
                return start;
            else
                return end;
        }

        else{

            int mid=(start+end)/2;

            if(matrix[mid][matrix[0].length-1]>target){
                // System.out.println("start="+start+" mid="+mid);
                mid=helper(start, mid, matrix, target);
            }

            else{
                // System.out.println("mid="+mid+" end="+end);
                mid=helper(mid, end, matrix, target);
            }

            return mid;
        }

    }
}

// 0ms( 100% ) 38.7mb ( 15.35% )

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            
            if(matrix[i][n-1]>=target){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target)
                        return true;
                }
            }
        }
        
        return false;
    }
}