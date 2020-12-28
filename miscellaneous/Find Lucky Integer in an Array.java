// SUSHANT SINHA

// fastest answer 0ms

class Solution {
    public int findLucky(int[] arr) {
        int[] map = new int[501];
        int max = -1;
        for(int i=0;i<arr.length;i++) {
            map[arr[i]]++;
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        int result = -1;
        for(int i=1;i<=max;i++) {
            if(map[i] == i) {
                result = i;
            }
        }
        return result;
    }
}

// 1ms

class Solution {
  public int findLucky(int[] arr) {
      
    int[] counter = new int[501];
    for (int num : arr) {
      counter[num]++;
    }
    for (int i = 500; i > 0; i--) {
      if (counter[i] == i) {
        return i;
      }
    }
    return -1;
  }
}