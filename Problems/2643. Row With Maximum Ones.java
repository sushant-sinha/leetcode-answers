class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int row=0, count=0, index=0;
        
        for(int i[]: mat){
            
            int tempCount=0;
            
            for(int j: i){
                
                if(j==1)
                    tempCount++;
                
            }
            
            if(tempCount>count){
                row=index;
                count=tempCount;
            }
            
            index++;
            
        }
        
        return new int[]{row, count};
        
    }
}