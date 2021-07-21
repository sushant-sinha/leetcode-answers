// SUSHANT SINHA

// 2ms ( 98.35% ) 47.6mb ( 99.40% )

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        /* 
            counts the pairs having same sum
            i.e [1,2] has (1*10)+(2)
            ans [2,1] has (1*10)+(2)
        */
        
        int[] sumcounter = new int[100];
        int ans= 0, index;
        
        for (int[] i : dominoes) {
            index = i[0] > i[1] ? i[1]*10 + i[0] : i[0]*10 + i[1];
            sumcounter[index]++;
        }
        
        for (int i = 0; i < 100; i++)
            if (sumcounter[i] > 1)
                // for getting the number of pairs from the count
                ans += (sumcounter[i]*(sumcounter[i]-1))/2;
        
        return ans;
    }
}