// SUSHANT SINHA

class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        long wt=0;
        long cur=customers[0][0];
        
        for(int i=0;i<customers.length;i++){
            
            if(cur<customers[i][0])
                cur=customers[i][0]+customers[i][1];
            
            else
                cur+=customers[i][1];
            
            wt+=cur-customers[i][0];
                        
        }
                
        
        return (double)wt/customers.length;
        
    }
}