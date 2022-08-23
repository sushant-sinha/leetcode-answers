// SUSHANT SINHA

// 11ms ( >83.33% ) 43.3mb ( >16.67% )
// most optimized solution in the bottom

// see this for the sorting of HashMap on the basis of keey

// https://www.javatpoint.com/how-to-sort-hashmap-in-java#:~:text=Sort%20HashMap%20by%20Keys&text=When%20we%20use%20LinkedHashMap%2C%20we,example%20Sort%20HashMap%20by%20Value.

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

// ~10ms

class Solution {
    public int[][] mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int [] item : items1){
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        
        for (int [] item : items2){
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        
        int [][] result = new int [map.size()][];
        int idx = 0;
        
        for (int key : map.keySet()){
            result[idx++] = new int [] {key , map.get(key)};
        }
        
        Arrays.sort(result, (a , b) -> a[0] - b[0]);
        
        return result;
    }
}