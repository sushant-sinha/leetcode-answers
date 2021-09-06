class Solution {
    public int[] closestDivisors(int num) {
        int s1=num+1, s2=num+2;
        
        // starting the loop from the largest element to get the closest two integers
        
        for(int i=(int)(Math.sqrt(s2));i>0;i--){
            
            if(s1%i==0)
                return new int[]{i,s1/i};
            
            else if(s2%i==0)
                return new int[]{i,s2/i};
        }
        
        return new int[]{};
        
    }
}