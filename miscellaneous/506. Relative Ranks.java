// SUSHANT SINHA


class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        
        int n = nums.length;
        
        int[] copy = nums.clone();
        
        Arrays.sort(copy);
        
        for (int i=0; i<n; i++) {
            int idx = n - Arrays.binarySearch(copy, nums[i]);
            
            switch(idx) {
                case 1:
                    res[i] = "Gold Medal";
                    break;
                case 2: 
                    res[i] = "Silver Medal";
                    break;
                case 3: 
                    res[i] = "Bronze Medal";
                    break;
                default: 
                    res[i] = String.valueOf(idx);
                    break;     
            }
        }
        
        
        return res;
    }
}