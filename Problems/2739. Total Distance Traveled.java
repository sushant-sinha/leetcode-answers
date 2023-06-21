// SUSHANT SINHA

// 7ms ( 100% ) 42.8mb ( 75.75% )

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        
        int totalDist=0;
        
        while(mainTank>=5){
            
            totalDist+=50;
            
            if(additionalTank>0){
                mainTank-=4;
                additionalTank--;
            }
            
            else{
                mainTank-=5;
            }
            
        }
        
        totalDist+=mainTank*10;
        
        return totalDist;
        
    }
}