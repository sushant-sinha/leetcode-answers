// SUSHANT SINHA
// 1107ms ( 5.02% ) 57.1mb ( 38.19% )

// using arraylist

class MyHashSet {
    
    List<Integer> arr;
    
    public MyHashSet() {
        
        arr=new ArrayList<Integer>();
    }
    
    public void add(int key) {
        
        if(!arr.contains(key)){
            arr.add(key);
        }
    }
    
    public void remove(int key) {
        
        int index=arr.indexOf(key);
        
        if(index!=-1){
            arr.remove(index);
        }
    }
    
    public boolean contains(int key) {
        
        return arr.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */