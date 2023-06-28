class Solution {
    public int countBeautifulPairs(int[] nums) {
        
        int ans=0;
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                
                int firstNum=((""+nums[i]).charAt(0)-'0');
                
                if(isCoPrime(firstNum, nums[j]%10))
                {
                    // System.out.println(nums[i]+" "+nums[j]);
                    ans++;
                }
            }
        }
        
        return ans;
        
    }
    
    boolean isCoPrime(int a, int b){
        
        if(a%2==0 && b%2==0)
            return false;
        
        if(a%3==0 && b%3==0)
            return false;
        
        if(a==b && a!=1)
            return false;
        
        return true;
        
    }
}