// SUSHANT SINHA

// 0ms (43.3mb 6.82%)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])return i;
        }
        
        return 0;
        
    }
}