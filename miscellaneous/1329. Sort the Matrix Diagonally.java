// indiacoder
class Solution {

    // TC : O(m*n * log(D)) , D stand min(m, n)
    // SC: O(m*n)
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        // i-j
        Map<Integer, PriorityQueue<Integer>> map =new HashMap<>();


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int diagonalKey = i-j;
                PriorityQueue<Integer> pq = map.getOrDefault(diagonalKey, new PriorityQueue<>());
                pq.offer(mat[i][j]);
                map.put(diagonalKey, pq);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int diagonalKey = i-j;
                PriorityQueue<Integer> pq = map.get(diagonalKey);

                mat[i][j] =pq.poll();
            }
        }

        return mat;

    }
}

// from discussion section korolev mikhail

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for (int i = 0; i<mat.length; i++) {
            DList list = new DList(mat, i, 0);
            qsort(list, 0, list.size()-1);
        }
        for (int j = 1; j<mat[0].length; j++) {
            DList list = new DList(mat, 0, j);
            qsort(list, 0, list.size()-1);
        }
        return mat;
    }
    
    private void qsort(DList list, int from, int to) {
        if (from >= to)
            return;
        int p = from;
        for (int i = from+1; i<=to; i++) {
            if (list.get(p)>list.get(i)) {
                swap(list, p, p+1);
                if (p+1!=i) swap(list, p, i);
                p++;
            }
        }
        qsort(list, from, p-1);
        qsort(list, p+1, to);
    }
    
    private void swap(DList list, int i, int j) {
        int tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
    
    class DList {
        int i, j, N, M, size;
        int[][] mat;
        DList(int[][] mat, int i, int j) {
            this.i = i; this.j = j; this.N = mat.length; this.M = mat[0].length;
            this.mat = mat;
            this.size = Math.min(N-i, M-j);
        }
        
        int get(int idx) { return mat[i+idx][j+idx]; }
        int size() { return size; }
        
        void set(int idx, int val) { mat[i+idx][j+idx] = val;}
    }
}