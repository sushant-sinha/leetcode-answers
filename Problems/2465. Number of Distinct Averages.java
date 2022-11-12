class Solution {
    public int distinctAverages(int[] nums) {
        
        Arrays.sort(nums);
        
        HashSet<Float> seen=new HashSet<>();
        
        for(int i=0;i<nums.length/2;i++){
            
            float temp=((float)nums[i]+(float)nums[nums.length-1-i])/2;
            
            //System.out.println("avg="+temp+" "+nums[i]+" "+nums[nums.length-i-1]);
            
            if(!seen.contains(temp)){
                seen.add(temp);
            }
            
        }
        
        return seen.size();
        
    }
}