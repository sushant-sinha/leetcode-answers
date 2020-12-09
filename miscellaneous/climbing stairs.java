// SUSHANT SINHA

class Solution {
    public int climbStairs(int n) {
		
               
        // int latest,pre1=1,pre2=1;
        // for(int i=1;i<n;i++){
		// latest=pre1+pre2;
		// pre2=pre1;
		// pre1=latest;
		// }
		// return prev1;
        // }
        
        // Same method but using arrays to store previous two cases
        
        int prevdata[]=new int[3];
        if(n==0 || n==1)return 1;
        prevdata[0]=1;prevdata[1]=1;
        for(int i=2;i<=n;i++){
            prevdata[2]=prevdata[0]+prevdata[1];
            prevdata[0]=prevdata[1];
            prevdata[1]=prevdata[2];
        }
        return prevdata[2];
    }
}