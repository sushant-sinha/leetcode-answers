class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // mapping the numbers and the indexes where they are seen
        
        HashMap<Integer, ArrayList<Integer>> seen=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            //System.out.println(seen.containsKey(nums[i]));
            
            if(seen.containsKey(nums[i])){
                
                ArrayList<Integer> index=seen.get(nums[i]);
                index.add(i);
                //System.out.println(seen.get(nums[i]));
                for(int x=0;x<index.size()-1;x++){
                    
                    for(int y=x+1;y<index.size();y++){
                        
                        if(Math.abs(index.get(x)-index.get(y))<=k){
                            //System.out.println(nums[i]+" "+x+" "+y);
                            return true;
                        }
                        
                    }
                    
                }
                
                
                
                seen.put(nums[i],index);
                
            }
            
            else{
                seen.put(nums[i], new ArrayList<Integer>(List.of(i)));
                // System.out.println(nums[i]+" "+seen.get(1));
            }
            
        }
        
        return false;
        
    }
}