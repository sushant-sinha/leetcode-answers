class Solution {
    public int maximizeGreatness(int[] nums) {
        
        // treemap 
        
        int ans=0;
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i:nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            
            else
                map.put(i,1);
        }
        
        for(int i=0;i<nums.length;i++){
            
            int checkFor=nums[i]+1;
            
            if(map.ceilingKey(checkFor)!=null){
                
                int key=map.ceilingKey(checkFor);
                
                // System.out.println("key="+key);
                
                if(map.get(key)==1){
                    map.remove(key);
                }
                
                else{
                    map.put(key, map.get(key)-1);
                }
                
                
                ans++;
            }
            
        }
        
        return ans;
        
    }
}