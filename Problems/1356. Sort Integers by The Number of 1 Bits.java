// SUSHANT SINHA

// 6ms ( 88.92% ) 39.8mb ( 24.97% )

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.bitCount(o1)-Integer.bitCount(o2);
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}