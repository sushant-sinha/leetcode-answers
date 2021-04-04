// SUSHANT SINHA

class Solution {
    public int sumOfUnique(int[] nums) {
        
        int sum=0;
        
        int dic[]=new int[101];
        
        for(int x:nums){
            
            dic[x]++;
            
        }
        
        for(int i=1;i<dic.length;i++){
            
            if(dic[i]==1)
                sum+=i;
        }
        
        return sum;
        
    }
}