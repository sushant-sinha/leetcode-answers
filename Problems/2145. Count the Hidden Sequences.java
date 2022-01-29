class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {                
        
        int cur=differences[0]*(-1), min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        
        for(int i=0;i<differences.length;i++){
                        
            min= cur>=min ? min : cur;
            max= cur<=max ? max : cur;
            
            cur+=differences[i];
            
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