// SUSHANT SINHA

// 103ms ( 80.51% ) 50.1mb ( 25.47% )

class Solution {
    public static boolean[]sieve(int n){
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) prime[i] = true;
        for (int p=2;p*p<= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }
    public int diff(int a,int b) {
        return b-a;
        }
    public int[] closestPrimes(int left, int right) {
        boolean []ans =sieve(right);
        ans[0]=false;
        ans[1]=false;
        int arr[] ={0,0};
        ArrayList<Integer> prime1=new ArrayList();
        for(int i=left;i<=right;i++){
            if(ans[i]) prime1.add(i);
        }
        if(prime1.size()<=1){
            int arrr[]={-1,-1};
            return arrr;
        }
        if(prime1.size()==2){
             int abc[]={prime1.get(0),prime1.get(1)};
             return abc;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prime1.size()-1;i++){
                if(diff(prime1.get(i),prime1.get(i+1))<min){
                    min=diff(prime1.get(i),prime1.get(i+1));
                    arr[0]=prime1.get(i);
                    arr[1]=prime1.get(i+1);
                }
        }
        return arr;
    }
}