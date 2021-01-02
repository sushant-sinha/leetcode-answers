// SUSHANT SINHA

// 0ms 38.5mb( 36.68%)

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int[] piece : pieces) {
                int first = piece[0];
                int index = findIndex(arr, first);
                if (index == -1) {
                    return false;
                }
                int i = 0;
                for (int j = index; i < piece.length && j < arr.length; i++, j++) {
                    if (arr[j] != piece[i]) {
                        return false;
                    }
                }
                if (i != piece.length) {
                    return false;
                }
            }
            return true;
        }

        private int findIndex(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
            return -1;
        }
    }

    // 1 ms 38.4mb( 52.57% )

    class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(x);
            sb.append("#");
        }
        for(int i = 0; i < pieces.length; i++){
            StringBuilder res = new StringBuilder();
            for(int j = 0; j < pieces[i].length; j++){
                res.append(String.valueOf(pieces[i][j]));
                res.append("#");
            }
            if(!sb.toString().contains(res.toString())){
                return false;
            }
        }
        return true;
    }
}