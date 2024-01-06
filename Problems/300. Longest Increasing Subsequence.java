// SUSHANT SINHA

// 172ms ( 12.41% ) 44.80mb ( 15.24% )

class Solution {
    public int lengthOfLIS(int[] nums) {

        TreeMap<Integer, Integer> map=new TreeMap<>();

        int ans=1;

        map.put(nums[0], 1);

        for(int i=1; i<nums.length; i++){

            if(map.lowerKey(nums[i])!=null){

                int key=map.lowerKey(nums[i]);

                int val=0;

                for(Map.Entry<Integer, Integer> e: map.entrySet()){

                    val=Math.max(e.getValue(), val);

                    if(e.getKey()==key)
                        break;


                }

                val++;

                ans=Math.max(ans, val);

                map.put(nums[i], val);
            }

            else{
                map.put(nums[i], 1);
            }

        }

        return ans;
        
    }
}