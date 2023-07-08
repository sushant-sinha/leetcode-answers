// SUSHANT SINHA

// 6ms ( 22.31% ) 44mb ( 59.60% )

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i:nums){

            if(map.containsKey(i)){
                if(map.get(i)==2){
                    map.remove(new Integer(i));
                }
                else{
                    map.put(i, map.get(i)+1);
                }
            }

            else{
                map.put(i,1);
            }

        }

        Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
        
        return entry.getKey();
    }
}