class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        
        for(int i=0;i<operations.length;i++){
            
            int val=operations[i][0];
            int index=(int)map.get(val);
            
            // the map.remove(key) returns an Object... so need to store it somewhere even when the returned value is of no use here
            Object temp=map.remove(operations[i][0]);
            map.put(operations[i][1],index);
            
        }
        
        for(Map.Entry m: map.entrySet()){
            
            nums[(int)m.getValue()]=(int)m.getKey();
            
        }
        
        return nums;
        
    }
}