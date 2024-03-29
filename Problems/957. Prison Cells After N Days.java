/*

 https://leetcode.com/problems/prison-cells-after-n-days/discuss/1294134/Short-and-Easy-Solution-JAVA

 the above link shows the repetition after evey 14 days....

 for n=7 the solution is same as n=21 and n=35

*/

// 0ms ( 100% ) 39.1mb ( 58.00% )

class Solution {
    public int[] prisonAfterNDays(int[] c, int n) {
        for (int j=(n-1)%14 +1; j>0;j--){
            int[] c2=new int[8];
            for (int i=1;i<7;++i){
                c2[i]= (c[i-1]==c[i+1])?1:0;
            }
            c=c2;
        }   
        return c;
    }
}


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