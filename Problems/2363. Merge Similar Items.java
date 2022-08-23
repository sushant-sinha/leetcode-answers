class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        HashMap<Integer, Integer> counter=new HashMap<>();
        
        // since all the elements in the items1 array have unique value... we dont need to check the presence of this key in the HashMap
        // we can directly add the value into the counter
        
        for(int i[]: items1)
            counter.put(i[0], i[1]);
        
        
        for(int i[]:items2){
            
            if(counter.containsKey(i[0])){
                counter.put(i[0], ((int)counter.get(i[0]) + i[1]));
            }
            
            else
                counter.put(i[0], i[1]);
            
        }
        
        // to sort the HashMap on the basis of the value in the key...
        // we will put the hashmap inside a TreeMap... then we can iterate over this to get data sorted on the basis of key
        
        // converting the HashMap to nested List
        
        List<List<Integer>> ans=new ArrayList<>();
        
        TreeMap<Integer,Integer> tm=new  TreeMap<Integer,Integer> (counter);  
        Iterator itr=tm.keySet().iterator(); 
        
        while(itr.hasNext()){
            
            List<Integer> temp=new ArrayList<>();
            
            int key=(int)itr.next();
            
            temp.add(key);
            temp.add(counter.get(key));
            
            ans.add(temp);
            
        }
        
        return ans;
        
    }
}
