class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int l=0, r=0, dash=0;
        
        for(char c:moves.toCharArray()){
            
            switch(c){
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
                case '_':
                    dash++;
                    break;
            }
        }
        
        return Math.max((l+dash-r),(r+dash-l));
        
    }
}