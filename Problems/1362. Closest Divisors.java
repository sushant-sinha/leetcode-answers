// SUSHANT SINHA

// 0ms ( 100% ) 36.8mb ( 72.07% )
/*

In https://leetcode.com/problems/closest-divisors/discuss/1365411/easy-java-solution, "i>=0" was used, even though "i" will never be equal to 0.
But still, divinding numbers by 0 is not good ☹☹.

*/

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
