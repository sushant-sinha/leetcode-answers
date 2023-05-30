// SUSHANT SINHA

// 17ms ( 66.8% ) 48.3mb ( 93.87% )

class MyHashSet {

    boolean set[];

    public MyHashSet() {

        set=new boolean[1000001];
        
    }
    
    public void add(int key) {

        set[key]=true;
        
    }
    
    public void remove(int key) {

        set[key]=false;
        
    }
    
    public boolean contains(int key) {

        return set[key];
        
    }
}