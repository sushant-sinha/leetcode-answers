// SUSHANT SINHA

// 64ms ( 38.94% ) 44mb ( 43.64% )

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        int ans=0, sum=0;
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i: banned)
            set.add(i);
        
        for(int i=1;i<=n && sum<=maxSum;i++){
            
            if(set.contains(i))
                continue;
            
            if(sum+i<=maxSum){
                sum+=i;
                ans++;
            }
        }
        
        return ans;
        
    }
}

// 5ms solution
// since the input size in very small.... choosing an array would've been a better choice instead of using a hashset

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] f = new boolean[10001];
        for (int e : banned) f[e] = true;
        int sum = 0;
        int cnt = 0;
        for (int a = 1; a <= n; ++a) {
            if (!f[a]) {
                sum += a;
                if (sum > maxSum) break;
                ++cnt;
            }
        }
        return cnt;
    }
}