class MapSum {

    HashMap<String,Integer> map;
    
    /** Initialize your data structure here. */
    public MapSum() {
        map=new HashMap<>();
        
    }
    
    public void insert(String key, int val) {
        
        map.put(key,val);
        
    }
    
    public int sum(String prefix) {
        
        int l=prefix.length();
        int ans=0;
        
        for (Map.Entry<String, Integer> e : map.entrySet()){
            String s=e.getKey();
            if(l<=s.length() && s.substring(0,l).equals(prefix)){
                ans+=e.getValue();
            }
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */