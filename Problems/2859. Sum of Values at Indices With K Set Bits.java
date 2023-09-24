class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int ans=0;
        
        for(int i=0;i<nums.size();i++){
            
            // System.out.println("val= "+i+" "+setBits(i));
            
            if(setBits(i)==k){
                ans+=nums.get(i);
            }
        }
        
        return ans;
        
    }
    
    int setBits(int n){
        
        int setCount=0;
        
        while(n!=0){
            setCount+=n%2;
            n/=2;
        }
        return setCount;
        
    }
}