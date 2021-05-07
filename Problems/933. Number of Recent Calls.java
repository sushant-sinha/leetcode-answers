// SUSHANT SINHA

class RecentCounter {

    ArrayList<Integer> count=new ArrayList<>();
    
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        
        count.add(t);
        
        int start=t-3000, ans=0;
        
        for(int i=count.size()-1;i>=0;i--){
            if(count.get(i)>=start){
                
                ans++;
            }
            else
                break;
        }
        
        return ans;
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */