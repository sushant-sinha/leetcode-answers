class Solution {
    
    int mp[];
    
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        mp=mapping;
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i: nums){
            
            int convertedVal=calculate(i);
            
            map.put(i,convertedVal);
            
        }
        
        Map<Integer, Integer> sorted= sortByValue(map);
        
        int indexInnums=0;
        
        
        for (Map.Entry<Integer, Integer> en : sorted.entrySet()) {
            
            nums[indexInnums++]=en.getKey();
        }
        
        return nums;
        
    }
    
    int calculate(int n){
        
        //System.out.print(n);
        
        int val=0, index=0;
        
        if(n==0)
            val=mp[0];
        
        while(n!=0){
            
            val+=mp[n%10]*Math.pow(10,index++);
            //System.out.print(" "+val);
            n/=10;
            
        }
        
        //System.out.println(" hi "+val);
        
        return val;
        
    }
    
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
}