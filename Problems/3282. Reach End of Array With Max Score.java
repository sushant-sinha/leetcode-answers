class Solution {
    public long findMaximumScore(List<Integer> nums) {

        long ans=0;

        long oldIndexVal=nums.get(0), oldIndex=0;

        for(int i=1;i<nums.size();i++){
            if(nums.get(i)>oldIndexVal){
                // System.out.println("in for index:"+i);
                ans+=(i-oldIndex)*oldIndexVal;
                oldIndex=i;
                oldIndexVal=nums.get(i);
            }
        }

        // System.out.println("oldindex = "+oldIndex);

        if(oldIndex!=nums.size())
            ans+=(nums.size()-1-oldIndex)*oldIndexVal;
        
        return ans;
    }
}