class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> seen=new HashSet<>();

        for(int i:nums)
            seen.add(i);

        int ans=0;

        for(int i:nums){

            if(!seen.contains(i+1)){

                int curVal=i-1;

                int curLen=1;

                while(seen.contains(curVal)){
                    curLen++;
                    curVal--;
                }

                ans = ans > curLen ? ans : curLen;

            }

        }

        return ans;
        
    }
}