// SUSHANT SINHA

// my lame brute force 🤣🤣😶😑
// 1953 ( 5.02% ) 53.7mb ( 20.29% )
// can be made easier we just throw HashMap

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int ans[]=new int[k];
        
        // for finding all unique IDs
        ArrayList<Integer> all = new ArrayList<>();
        
        for(int i[]:logs){
            if(!all.contains(i[0]))
                all.add(i[0]);
        }
        
        for(int i:all){

            // for finding unique time
            ArrayList<Integer> rec =new ArrayList<>();
            
            for(int x[]:logs){
                if(x[0]==i && !rec.contains(x[1]))
                    rec.add(x[1]);
            }
            
            int l=rec.size();
            
            if(l>0)
                ans[l-1]++;
            
        }
        
        return ans;
        
    }
}

// best solution

// 10ms ( 100% ) 49.7mb ( 64.55% )

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        // magic
        Arrays.sort(logs,(a,b)->a[0]==b[0]?a[1]-b[1]: a[0]-b[0]);
        int ans[] = new int[k];
        
        // in one array traverse we get the answer

        int i=0;
        while(i<logs.length){
            int count=0, last=-1;
            int user=logs[i][0];
            while(i<logs.length && logs[i][0]==user){
                if(logs[i][1]!=last){
                    count++;
                    last = logs[i][1];
                }
                i++;
            }
            ans[count-1]++;
        }
            
        return ans;
    }
}