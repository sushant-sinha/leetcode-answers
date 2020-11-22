// SUSHANT SINHA
class Solution {
    public int[] replaceElements(int[] arr) {
        int max,n=arr.length;
        for(int i=0;i<(n-1);i++){
            max=arr[n-1];
            for(int j=(i+1);j<(n-1);j++){
                max=Math.max(max,(Math.max(arr[j],arr[j+1])));
            }
            arr[i]=max;
        }
        arr[n-1]=-1;
        return arr;
    }
}