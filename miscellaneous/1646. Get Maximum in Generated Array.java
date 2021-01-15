// SUSHANT SINHA


class Solution {
    public int getMaximumGenerated(int n) {
        
        if(n==0) return 0;
        if(n==1) return 1;
        
        int arr[]=new int[n+1];
        
        arr[0]=0;
        arr[1]=1;
        
        for(int i=2;i<n+1;i++){
            
            if(i%2==0)arr[i]=arr[i/2];
            else{
                int x=i/2;
                arr[i]=arr[x]+arr[x+1];
            }
            
        }
        
        Arrays.sort(arr);
        return arr[n];
        
    }
}