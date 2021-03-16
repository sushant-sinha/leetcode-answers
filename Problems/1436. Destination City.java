// SUSHANT SINHA

// 1ms ( 100% ) 38.5mb ( 74.88% )

class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<String, String>(); //hashmap to store relationship between points
        
        for(int i = 0; i < paths.size(); i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1)); //store relationships
        }
        
        String str = paths.get(0).get(0); //starting point (can be any point in list, since any path will lead to 1 ending point
        
        while(true){                                   //since all paths will lead to single city at the end, find next city from starting point, then set that as new starting point.
            if(map.containsKey(str)){
                str = map.get(str);
            }else{
                return str;         //the ending city will not have a ending point (== null in Hashmap)
            }
        }
    }
}