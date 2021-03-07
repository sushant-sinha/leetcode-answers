// TRY

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            var min = arr1[i] - d;
            var max = arr1[i] + d;
            while (j < arr2.length && arr2[j] < min) j++; //can be optimized with binary search
            if (isOutOfRange(arr2, j, min, max)) count++;
        }
        return count;
    }
    
    private static boolean isOutOfRange(int[] arr, int idx, int min, int max) {
        return idx == arr.length || !(min <= arr[idx] && arr[idx] <= max);
    }
}