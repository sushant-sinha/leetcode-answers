// SUSHANT SINHA 

// my solution 61ms ( 5.33% ) 39.4mb ( 64.07% )

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> ans=new ArrayList<>();
        
        for(int x[]:matrix){
            
            int i=0;
            
            boolean flag=false;
            
            for(;i<x.length;i++){
                
                ArrayList<Integer> temp=new ArrayList<>();
                
                for (int a:x)
                    temp.add(a);
                
                Collections.sort(temp);
                
                if(x[i]==temp.get(0)){
                    
                    flag=true;
                    break;
                }
                
            }
            
            if(flag){
                
                boolean ck=true;
                
                for(int j=0;j<matrix.length;j++){
                    if(!(matrix[j][i]<=x[i])){
                        ck= false;
                        break;
                        
                    }
                }
                
                if(ck)ans.add(x[i]);
                
            }
            
        }
        
        return ans;
        
    }
}

// 1ms solution

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
		
		// traverse all rows
        for(int i = 0 ; i < matrix.length ; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int j = 0 ; j < matrix[i].length ; j++) //traverse columns for current row
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean valid = true;
			//traverse all rows for required column from previous loop
            for(int j = 0 ; j < matrix.length ; j++){ 
                if(matrix[j][minIndex] > min){ // if not max, then not valid
                    valid = !valid;
                    break;
                }
            }   
            if(valid)
                ans.add(min);
        }
        return ans;
    }
}

// 0ms solution 39.2mb ( 93.78% )

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            int minCol = minColInRow(matrix,i);
            int val = matrix[i][minCol];
            if(maxRowInCol(matrix,val,minCol))
                list.add(val);
        }
        return list; 
    }
    
    public int minColInRow(int[][] matrix,int row){
        int min = matrix[row][0];
        int minCol = 0;
        for(int j = 1;j < matrix[row].length;j++){
            if(matrix[row][j] < min){
                min = matrix[row][j];
                minCol = j;
            }
        }
        return minCol;
    }
    
    public boolean maxRowInCol(int[][] matrix,int val,int col){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][col] > val)
                return false;
        }
        return true;
    }
}