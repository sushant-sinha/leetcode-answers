// SUSHANT SINHA

// 3ms ( 98.19% ) 54.2mb ( 95.37% )

class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int ans[]=new int[n];
        
        int given=0;
        
        for(int i:rolls)
            given+=i;
        
        int needed=mean*(rolls.length+n)-given;
        
        // checking for the possibility of an answer....     
        
        if(needed>6*n || needed<1*n)
            return new int[0];
        
        // or can use return new int[] {}; for returning empty array
        
        // populating the array with the base value
        
        int fixed=needed/n;
        
        for(int i=0;i<n;i++)
            ans[i]=fixed;
        
        // adding 1 to every element
        
        int extra=needed%n;
        
        for(int i=0;i<extra;i++)
            ans[i]++;
        
        return ans;        
        
    }
}
