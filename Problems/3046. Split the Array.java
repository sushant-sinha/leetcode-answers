class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        
        int freq[]=new int[101];
        
        for(int i:nums)
            freq[i]++;
        
        for(int i:freq)
            if(i>2)
                return false;
        
        return true;
        
    }
}