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