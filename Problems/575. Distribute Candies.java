// SUSHANT SINHA

// 55ms ( 58.36% ) 74mb (77.47% )

class Solution {
    public int distributeCandies(int[] candyType) {
        
        int allowedCandies=candyType.length/2;
        
        Arrays.sort(candyType);
        
        int unique=1;
        
        for(int i=1;i<candyType.length;i++){
            
            if(candyType[i]!=candyType[i-1])
                unique++;
            
        }
        
        return unique<allowedCandies ? unique : allowedCandies   ;
        
    }
}