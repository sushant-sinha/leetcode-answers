// SUSHANT SINHA

// 0ms ( 100% ) 36.2mb ( 98.02% )

class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int even=0,odd=0;
        
        for(int i=0;i<position.length;i++){
            
            if(position[i]%2==0)
                even++;
            else
                odd++;
        }
        
        return even>odd ? odd : even;
    }
}