// using arraylist was my initial intuition, but the couldn't have used more brain cells
// found the solution which uses TreeSet instead of ArrayList

class NumberContainers {

    // mapping of the number and the indexes
    
    HashMap<Integer, ArrayList<Integer>> map;
    
    // this is the HashMap that maps the indexes with the values tored within it
    HashMap<Integer, Integer> indnum;
    
    public NumberContainers() {
        map=new HashMap<>();
        indnum=new HashMap<>();
    }
    
    public void change(int index, int number) {
        
        
        if(indnum.containsKey(index)){
            
            int num=indnum.get(index);
            ArrayList<Integer> i=map.get(num);
            
            i.remove(index);
            
            if(i.size()==0){
                map.remove(num);
            }
            
            else{
                map.put(num, i);
            }
        }
        
        ArrayList<Integer> i=map.put
        
    }
    
    public int find(int number) {
        
        if(map.containsKey(number)){
            
            return map.get(number).get(0);
            
        }
        
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */

// found this solution from the discuss section

/*

// 173.5mb ( 58.53% ) 173.5mb ( 23.19% )


class NumberContainers {
    private Map<Integer, TreeSet<Integer>> numIndexSet = new HashMap<>();
    private Map<Integer, Integer> indexNumMap = new HashMap<>();

    public NumberContainers() {
        
    }
    
    public void change(int index, int number) {
        if (indexNumMap.containsKey(index)) {
            int num = indexNumMap.get(index);
            TreeSet<Integer> indexSet = numIndexSet.get(num);
            indexSet.remove(index);
            if (indexSet.size() == 0) {
                numIndexSet.remove(num);
            } else {
                numIndexSet.put(num, indexSet);
            }
        }
        TreeSet<Integer> newIndexSet = numIndexSet.getOrDefault(number, new TreeSet<>());
        newIndexSet.add(index);
        numIndexSet.put(number, newIndexSet);
        indexNumMap.put(index, number);
    }
    
    public int find(int number) {
        if (numIndexSet.containsKey(number)) {
            return numIndexSet.get(number).first();
        }
        return -1;
    }
}

*/