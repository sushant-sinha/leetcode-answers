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

// using integer array
// 12ms ( 16.90% ) 39.5mb ( 52.31% )

class Solution {
    public int minPartitions(String n) {
        
        int ex[]=new int[10];
        
        for(char c:n.toCharArray()){
            ex[Character.getNumericValue(c)]++;
            if(ex[9]!=0)
                return 9;
        }
        int max=8;
        for(;max>0;max--)
            if(ex[max]!=0)
                break;
        
        return max;
    }
}

