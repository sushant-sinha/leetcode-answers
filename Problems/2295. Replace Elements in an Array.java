// SUSHANT SINHA

// 94ms ( 62.09% ) 163.7mb ( 82.67% )

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        /*

        the hashmap maps value->index
        this is because at the time of replacing value (when used index->value mapping), we will have to traverse the entire map..
        but using value->index mapping means, we would just get the value (using map.get(key) key here is the value) and then delete(remove) it from the map... then make a new mapping for the replaced number(key) with the same index(value)
        haven't checked it for the performance ( whether faster that for, entrySet )... but is less in terms of sloc

        */
        
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