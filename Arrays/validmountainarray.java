// SUSHANT SINHA
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;boolean a=false,b=false;
        while(i<(arr.length-1) && arr[i]<arr[i+1]) {
            i++;a=true;
        }
        while(i<(arr.length-1) && arr[i]>arr[i+1]){
            i++;b=true;
        }
        if(i==(arr.length-1) && a && b)return true;
        else return false;
    }
}