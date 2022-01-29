// SUSHANT SINHA

// 2ms ( 100% ) 54.7mb ( 82.00% )

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {                
        
        int cur=differences[0]*(-1), min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        
        for(int i=0;i<differences.length;i++){
                        
            min= cur>=min ? min : cur;
            max= cur<=max ? max : cur;
            
            cur+=differences[i];
            
            // passed 83/85 test cases without this if condition.... failed the 84th test case because the statement in line #24 would reset the large value to be in range
            if(max-min>upper-lower)
                return 0;
            
        }
        
        min= cur>=min ? min : cur;
        max= cur<=max ? max : cur;
        
        int diff=lower-min;
        
        min+=diff; max+=diff;
        
        if(max>upper)
            return 0;
        
        
        return upper-max+1;
        
    }
}