class Solution {
    public int numTilings(int n) {

        int ans=0;

        if(n<3)
        return n;

        long ar[]=new long[4];

        ar[0]=1;
        ar[1]=1;
        ar[2]=2;

        for(int i=3;i<=n;i++){

            ar[3]=(2*(ar[2])+ar[0])%1000000007;
            ar[0]=ar[1];
            ar[1]=ar[2];
            ar[2]=ar[3];

            // System.out.println(ar[3]);
        }

        return (int)ar[3];
        
    }
}