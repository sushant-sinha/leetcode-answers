class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        
        long sum=0, tempSum=0;
        
        //mapping the number with its frequency
        HashMap<Integer, Integer> freq=new HashMap<>();
        
        //initial sum(if possible) of the first k numbers
        for(int i=0;i<k;i++){
            freq.put(nums.get(i), freq.getOrDefault(nums.get(i), 0)+1);
            tempSum+=nums.get(i);
        }
        
        // System.out.println(freq);
        if(freq.size()>=m)
            sum=tempSum;
        
        for(int i=k;i<nums.size();i++){
            
            if(freq.containsKey(nums.get(i-k))){
                
                if(freq.get(nums.get(i-k))==1){
                    freq.remove(nums.get(i-k));
                }
                
                else{
                    freq.put(nums.get(i-k), freq.get(nums.get(i-k))-1);
                }
            }
            
            tempSum-=nums.get(i-k);
            // System.out.println("after removing tempsum="+tempSum+" "+freq);
            
            freq.put(nums.get(i), freq.getOrDefault(nums.get(i), 0)+1);
            
            tempSum+=nums.get(i);
            // System.out.println("after adding tempsum="+tempSum+" fre1size="+freq.size()+" "+freq);
            
            if(freq.size()>=m)
                sum=Math.max(sum, tempSum);
        }
        
        return sum;
        
    }
}