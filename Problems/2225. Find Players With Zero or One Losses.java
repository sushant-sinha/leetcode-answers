// SUSHANT SINHA

// not the most optimal solution for obvious reasons
// 477ms ( 14.25% ) 152.3mb ( 52.06% )

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        // mapping the player and the no. of loses
        TreeMap<Integer, Integer> map= new TreeMap<>();
        
        for(int i[]:matches){
            
            if(!map.containsKey(i[0]))
                map.put(i[0], 0);
            
            if(!map.containsKey(i[1]))
                map.put(i[1], 1);
            
            else
                map.put(i[1], map.get(i[1])+1);
            
            
        }
        
        List<List<Integer>> ans= new ArrayList<>();
        
        List<Integer> winner1=new ArrayList<>();
        List<Integer> winner2=new ArrayList<>();
        
        for (Map.Entry<Integer,Integer> element : map.entrySet()) {
            
            if(element.getValue()==0){
                winner1.add(element.getKey());
                continue;
            }
            
            if(element.getValue()==1){
                winner2.add(element.getKey());
                continue;
            }
        }
        
        ans.add(winner1);
      ans.add(winner2);
        
        return ans;
        
    }
}