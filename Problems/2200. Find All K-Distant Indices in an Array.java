class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        List<Integer> ans = new ArrayList<>();

        int i=0;

        for(int j=0; j<nums.length; j++) {

            if(nums[j] == key) {
                
                if(ans.size() == 0)
                    i=0;

                else
                    i=ans.get(ans.size()-1)+1;
                
                i=Math.max(j-k,i);

                int end = Math.min(j+k,nums.length-1);
                    
                for(; i<=end; i++)
                    ans.add(i);
            }
        }

        return ans;
        
    }
}