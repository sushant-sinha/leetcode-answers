// SUSHANT SINHA

class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int n=(A.length)/2;
                
        for(int i=0;i<A.length;){
            int count=0;
            int x=A[i];
            for(;i<A.length;i++){
                if(A[i]==x)count++;
                else break;
            }
            if(count==n)return x;
        }
        
        return 0;
        
    }
}