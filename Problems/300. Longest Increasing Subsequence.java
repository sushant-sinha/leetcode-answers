// SUSHANT SINHA

// 172ms ( 12.41% ) 44.80mb ( 15.24% )
// not O(n lgn) because of the for loop needed for traversing the map

class Solution {
    public int lengthOfLIS(int[] nums) {

        TreeMap<Integer, Integer> map=new TreeMap<>();

        int ans=1;

        map.put(nums[0], 1);

        for(int i=1; i<nums.length; i++){

            // finding the key lower than the current val in array and which has the maximum number of elements smaller than it
            if(map.lowerKey(nums[i])!=null){

                // greatest key strictly smaller than the current array element
                int key=map.lowerKey(nums[i]);

                int val=0;

                // finding the element which has the maximum value and smaller than the 'key'
                for(Map.Entry<Integer, Integer> e: map.entrySet()){

                    val=Math.max(e.getValue(), val);

                    // break when the biggest key is seen
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