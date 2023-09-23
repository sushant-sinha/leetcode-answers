// SUSHANT SINHA

// 1ms ( 100% ) 41.4mb ( 66.91% )

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        
        if(nums.size()==1)
            return 0;
        
        // find the point from where the array should be sorted. i.e find the minimum element in the entire array
        
        int minIndex=0;
        int minVal=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.size();i++)
            if(minVal>nums.get(i)){
                minVal=nums.get(i);
                minIndex=i;
            }
        
        for(int i=1;i<nums.size();i++){
            if(nums.get((minIndex+i)%nums.size())<nums.get((minIndex+i-1)%nums.size()) )
                return -1;
        }
        
        return (nums.size()-minIndex)%nums.size();
    }
}