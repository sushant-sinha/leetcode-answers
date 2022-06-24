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

// using HashSet
// 63ms ( 40.67% ) 111.1mb ( 22.25% )

class Solution {
    public int distributeCandies(int[] candyType) {
        
        int allowedCandies=candyType.length/2;
        
        HashSet<Integer> unique=new HashSet<>();
        
        for(int i:candyType){
            
            unique.add(i);
            
        }
        
        return Math.min(unique.size(), allowedCandies);
        
    }
}