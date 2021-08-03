class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int ans[]=new int[k];
        
        ArrayList<Integer> all = new ArrayList<>();
        
        for(int i[]:logs){
            if(!all.contains(i[0]))
                all.add(i[0]);
        }
        
        for(int i:all){
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