// SUSHANT SINHA

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