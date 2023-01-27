// SUSHANT SINHA

// 3ms ( 68.18% ) 74.8mb ( 31.12% )

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int ans[][]=new int[score.length][score[0].length];
        
        TreeMap<Integer, int[]> map=new TreeMap<>(Collections.reverseOrder());
        
        for(int i=0;i<score.length;i++){
            map.put(score[i][k], score[i]);
        }
        
        int i=0;
        
        for(Map.Entry<Integer, int[]> e: map.entrySet())
            score[i++]=e.getValue();
        
        return score;
        
    }
}