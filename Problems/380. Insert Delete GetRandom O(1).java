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