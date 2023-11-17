// SUSHANT SINHA

// 12ms ( 33.23% ) 46.3mb ( 71.66% )

// can maintain an array for the frequency of all the elements in nums

// while traversing and calculating frequencies.... track the numbers which have the top 2 maximum freuencies
// keep on updaing these values untill we've traversed the entire nums

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int val=nums.length/3;

        HashMap<Integer, Integer> freq=new HashMap<>();

        List<Integer> ans=new ArrayList<>();

        for(int i:nums){

            if(ans.contains(i))
                continue;

            else{

                freq.put(i, freq.getOrDefault(i,0)+1);

                if(freq.get(i)>val){
                    ans.add(i);
                }
            }
            
        }

        return ans;
        
    }
}