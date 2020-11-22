// SUSHANT SINHA
class Solution {
    public int[] sortedSquares(int[] A) {
        int x;
        int arr[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[i]=A[i]*A[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=(i+1);j<arr.length;j++){
                if(arr[i]>arr[j]){
                    x=arr[i];arr[i]=arr[j];arr[j]=x;
                }
            }
        }
        return arr;
    }
}
