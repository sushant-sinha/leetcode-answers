// SUSHANT SINHA

// using ArrayList
// 312ms ( 6.10% ) 46.8mb ( 35.49% )

class MyHashMap {

    ArrayList<Integer> lkey;
    ArrayList<Integer> lvalue;

    /** Initialize your data structure here. */
    public MyHashMap() {

        lkey=new ArrayList<>();
        lvalue=new ArrayList<>();
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {

        if(!lkey.contains(key)){
            lkey.add(key);
            lvalue.add(value);
        }

        else{
            if(lkey.contains(key)){
                int index=0;

                for(int i:lkey){
                    if(i==key)
                        break;
                    index++;
                }

                lvalue.remove(index);
                lvalue.add(index,value);
            }
        }
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {

        if(lkey.contains(key)){
            int index=0;

            for(int i:lkey){
                if(i==key)
                    break;
                index++;
            }

            return lvalue.get(index);
        }

        else return -1;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {

        if(lkey.contains(key)){
            int index=0;

            for(int i:lkey){
                if(i==key)
                    break;
                index++;
            }
            

            lvalue.remove(index);
            lkey.remove(index);
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */


// using array
// 18ms ( 63.29% ) 46.7mb ( 42.59% )

class MyHashMap {
    
    int val[];

    /** Initialize your data structure here. */
    public MyHashMap() {
        
        val=new int[1000001];
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        
        // since 0 can be input val, so we store every value incremented by one i.e. 0 is stored as 1.
        // if the value is found to be 0, this means its blank i.e no value exists for this key ( array index )

        val[key]=value+1;
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        
        if(val[key]==0)
            return -1;
        
        return val[key]-1;        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        
        val[key]=0;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */