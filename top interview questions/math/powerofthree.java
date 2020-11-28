// SUSHANT SINHA
class Solution {
    public boolean isPowerOfThree(int n) {
        
        // Traditional method using for loops
        
//        if(n<=0 || n==2)return false;
//         if(n==3 || n==1)return true;
//         int r=0;
//         boolean ans=true;
        
//         while(n>3){
//             r=n%3;
//             if(r!=0)return false;
//             n/=3;
//         }
//         if(n<3)return false;
//         return ans;
        
        // 3^19 is the largest number i.e 1162261467 which can be stored in INTEGER. 3^20>2^31.
        
        return n>0 && 1162261467%n==0;
    }
}