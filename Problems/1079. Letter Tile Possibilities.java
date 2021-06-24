class Solution {
    // more like backtracking
    public int numTilePossibilities(String tiles) {
        int[] cnt = new int[26];
        for (char c : tiles.toCharArray()) cnt[c-'A']++;
        return dfs(cnt);
    }
    
    // dfs but also backtrack
    private int dfs(int[] arr) {
        int sum = 0;
        
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) continue;
            sum++; // count a possible generation
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        
        return sum;
    }
}