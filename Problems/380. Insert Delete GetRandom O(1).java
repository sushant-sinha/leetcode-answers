// SUSHANT SINHA

// 216ms ( 8.83% ) 84mb ( 96.96% )

import java.util.Random;

class RandomizedSet {

    ArrayList<Integer> ar=new ArrayList<>();
    
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        
        // System.out.println("insert "+ar.toString());
        
        if(ar.contains(val))
            return false;
        
        else{
            ar.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        
        // System.out.println("remove "+ar.toString());
        
        if(ar.contains(val)){
            ar.remove(new Integer(val));
            return true;
        }
        
        else
            return false;
    }
    
    public int getRandom() {
        
        // System.out.println("random "+ar.toString());
        
        Random rand = new Random();
        //int int_random = rand.nextInt(ar.size());
        
        return ar.get(rand.nextInt(ar.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */



// better solution
// 56ms ( 30.23% ) 97.1mb ( 42.02% )

class RandomizedSet {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    
    Random rnd = new Random();

    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;

        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        Integer pos = map.get(val);
        if (pos == null)
            return false;

        if (list.size() > 1) {
            int val2 = list.get(list.size() - 1);
            list.set(pos, val2);
            map.replace(val2, pos);
        }
        
        map.remove(val);
        list.remove(list.size() - 1);

        return true;
    }

    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */