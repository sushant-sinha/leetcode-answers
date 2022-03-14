// SUSHANT SINHA

// 5ms ( 79.46% ) 47.7mb ( 54.11% )

class Solution {
    public List<String> cellsInRange(String s) {
        
        // splitting s to get the starting and ending cell
        String pos[]=s.split(":");
        
        /*

        if not using split, then: ( 7ms (65.46%) 42.8mb (97.49%) || 3ms (93.72) 47.5mb (62.92))

        int n1=Integer.parseInt(s.substring(1,2)), n2=Integer.parseInt(s.substring(4,5));
        
        char start=s.charAt(0), end=s.charAt(3);

        */

        ArrayList<String> ans= new ArrayList<>();
        
        // initializing numeric values for the rows        
        int n1=Integer.parseInt(pos[0].substring(1)), n2=Integer.parseInt(pos[1].substring(1));
        
        // initializing char values for the columns
        char start=pos[0].charAt(0), end=pos[1].charAt(0);
        
        // StringBuilder is the fastest way of concatenating
        StringBuilder cell;
        
        while(start<=end){
            
            int index=n1;
            
            while(index<n2+1){
                
                cell=new StringBuilder();
                cell.append(start).append(index);
                
                ans.add(cell.toString());
                index++;
            }
            
            start++;
            
        }
        
        return ans;
        
    }
}

// best solution 
// 2ms ( 98.10% ) 46.9mb ( 85.39% )

class Solution {
    public List<String> cellsInRange(String s) {
        
        List<String> output = new ArrayList<>();
        
        char startCol = s.charAt(0);
        char startRow = s.charAt(1);
        
        int cols = s.charAt(3) - startCol;
        int rows = s.charAt(4) - startRow;
        
        char[] cell = new char[2];
        
        for(int col = 0; col <= cols; col++){
            for(int row = 0; row <= rows; row++){
                cell[0] = (char) (startCol + col);
                cell[1] = (char) (startRow + row);
                output.add(new String(cell));
            }
        }
        
        return output;
    }
}