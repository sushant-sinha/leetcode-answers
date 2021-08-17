// this code gives TLE for large number of days (as expected)

class Solution {
    
    public int[] prisonAfterNDays(int[] cells, int n) {
        
        int counter[]=new int[6];
        
        n--;
        
        for(int i=1;i<7;i++){
            
            if(cells[i-1]==cells[i+1])
                counter[i-1]=1;
            else
                counter[i-1]=0;
            
        }
        
        for(int i=0;i<6;i++)
            cells[i+1]= counter[i]==0 ? 0 : 1;
        
        cells[0]=0;
        cells[7]=0;
        
        while(n>0){            
            n--;
            
            for(int i=1;i<7;i++){
            
                if(cells[i-1]==cells[i+1])
                    counter[i-1]=1;
                else
                    counter[i-1]=0;
            }
            
            for(int i=0;i<6;i++)
                cells[i+1]= counter[i]==0 ? 0 : 1;
            
        }
        
        return cells;
        
    }
}