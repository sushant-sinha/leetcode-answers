class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] sumcounter = new int[100];
        int ans= 0, index;
        
        for (int[] i : dominoes) {
            index = i[0] > i[1] ? i[1]*10 + i[0] : i[0]*10 + i[1];
            sumcounter[index]++;
        }
        
        for (int i = 0; i < 100; i++)
            if (sumcounter[i] > 1)
                ans += (sumcounter[i]*(sumcounter[i]-1))/2;
        
        return ans;
    }
}