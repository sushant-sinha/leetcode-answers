class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length==k)
            return nums;
        
        int ans[]=new int[k];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        
        // sorting algo from GFG
        
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        
        int i=0;
        
        for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
            ans[i++]=en.getKey();
            if(i==k)
                break;
        }
        
        return ans;
        
    }
}