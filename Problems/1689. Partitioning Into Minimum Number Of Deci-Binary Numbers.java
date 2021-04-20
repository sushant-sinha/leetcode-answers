// SUSHANT SINHA

// 8ms ( 33.36% ) 39.3mb ( 82.15% )

class Solution {
    public int minPartitions(String n) {
        
        int max=0;
        
        for(char c:n.toCharArray()){
            if(max<Character.getNumericValue(c))
                max=Character.getNumericValue(c);
            if(max==9)
                break;
        }
        
        return max;
    }
}
