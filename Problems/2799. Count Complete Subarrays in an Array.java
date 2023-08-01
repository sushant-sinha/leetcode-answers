class Solution {
    public int countCompleteSubarrays(int[] nums) {

        int ans=0;

        HashSet<Integer> count=new HashSet<>();

        for(int i: nums)
            count.add(i);

        int uniCount=count.size();

        // using sliding window approach

        HashMap<Integer, Integer> map=new HashMap<>();

        int start=0, end=0;

        while(start<nums.length){

            map.put(nums[start], map.getOrDefault(nums[start], 0)+1);

            while(end<=start && map.size()==uniCount){

                // need to add all the arrays between index start and nums.length
                // this is because... subarray between end and start already has all the unique elements... so if I add following elements(elements after start) of nums array to this subarray... then it wont change the current number of unique elements in the subarray which is equal to the total numver of unique elements in nums.
                // therefore we need to add all the subarrays ranging between: [end,start] and [end, nums.length], i.e (nums.length-start) should be added to the ans

                ans+=nums.length-start;

                // System.out.println(start+" "+end);
                int endNumFreq=map.get(nums[end]);

                if(endNumFreq==1)
                    map.remove(new Integer(nums[end]));
                
                else
                    map.put(nums[end], endNumFreq-1);
                end++;
            }

            ++start;
        }

        return ans;
        
    }
}