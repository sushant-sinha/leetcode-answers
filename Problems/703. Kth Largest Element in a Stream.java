class KthLargest {

    ArrayList<Integer> list = new ArrayList<>();
    int n=0;
    
    public KthLargest(int k, int[] nums) {
        
        n=k;
        
        for(int i:nums){
            list.add(i);
        }
        
    }
    
    public int add(int val) {
        
        list.add(val);
        
        Collections.sort(list);
        
        return list.get(list.size()-n);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */