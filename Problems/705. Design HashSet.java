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

// my above solution might not be the expected one..
// from the submission section, I found the following unique solutions: 

class MyHashSet {
    int num[];
    public MyHashSet() {
        num = new int[31251];
    }
    
    // set the bit if that element is present
    public void add(int key) {
        num[getIdx(key)]|=getMask(key);
    }
    
    //unset the bit if a key is not present
    public void remove(int key) {
        num[getIdx(key)] &= (~getMask(key));
    }
    
    //check if bit corresponding to the key is set or not
    public boolean contains(int key) {
        return (num[getIdx(key)]&getMask(key))!=0;
    }
    
    // idx of num[] to which this key belongs
    // for key = 37, it will give 1
    private int getIdx(int key)
    {
        return (key/32);
    }
    
    // get mask representing the bit inside num[idx] that corresponds to given key.
    // for key = 37, it will give 00000000000000000000000000100000
    private int getMask(int key)
    {
        key%=32;
        return (1<<key);
    }
}

class MyHashSet {
    
    boolean buckets[][];
    int bucket = 10000;
    int bucketItem = 10000;
    
    public MyHashSet() {
        buckets = new boolean[bucket][];
    }
    
    public int getBucket(int key){
        return key / bucket;
    }
    
    public int getBucketItem(int key){
        return key % bucketItem;
    }
    
    public void add(int key) {
        
        int bucketKey = getBucket(key);
        int bucketItemkey = getBucketItem(key);
        
        if(buckets[bucketKey] == null)
            buckets[bucketKey] = new boolean[bucketItem];
        
        buckets[bucketKey][bucketItemkey] = true;
        
    }
    
    public void remove(int key) {
        
        int bucketKey = getBucket(key);
        int bucketItemkey = getBucketItem(key);
        
        if(buckets[bucketKey] != null)
             buckets[bucketKey][bucketItemkey] = false;
    }
    
    public boolean contains(int key) {
        int bucketKey = getBucket(key);
        int bucketItemkey = getBucketItem(key);
        
         if(buckets[bucketKey] != null)
             return  buckets[bucketKey][bucketItemkey];
        return false;
    }
}

// similar to the above solution

class MyHashSet {
    private boolean[][] storgae;
    private int buckets;
    private int bucketItems;

    public MyHashSet() {
        this.buckets = 1000;
        this.bucketItems =1000;
        // Creates a new boolean array with the specified number of elements determined by the buckets variable. However, the second dimension of the array is not specified initially, leaving it as an array of arrays with null references.
        this.storgae = new boolean[buckets][];
    }
    
    private int hash1(int key){
        return key % buckets;
    }

    private int hash2(int key){
        return key / bucketItems;
    }

    public void add(int key) {
        int hash1Value = hash1(key);
        if (storgae[hash1Value] == null){
            if (hash1Value ==0){
                storgae[hash1Value] = new boolean[bucketItems + 1];
            }
            else{
                storgae[hash1Value] = new boolean[bucketItems];
            }
        }
        int hash2Value = hash2(key);
        storgae[hash1Value][hash2Value] = true;
    }
    
    public void remove(int key) {
        int hash1Value = hash1(key);
        if(storgae[hash1Value] == null) return;
        int hash2Value = hash2(key);
        storgae[hash1Value][hash2Value] = false;
    }
    
    public boolean contains(int key) {
        int hash1Value = hash1(key);
        if(storgae[hash1Value] == null) return false;
        int hash2Value = hash2(key);
        return storgae[hash1Value][hash2Value];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */