// SUSHANT SINHA

// 519ms ( 8.35% ) 40.2mb ( 42.29% )

class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> map =new HashMap<>();
                
        for(int i=0;i<s.length();i++){
            
            if(map.containsKey(Character.valueOf(s.charAt(i)))){
                int x=(int)(map.get(Character.valueOf(s.charAt(i))));
                ++x;
                map.put(Character.valueOf(s.charAt(i)),Integer.valueOf(x));
            }
            
            else
                map.put(Character.valueOf(s.charAt(i)),1);
            
        }
                
        return sortByValue(map);
        
    }
    
    // modified sorting by value of hashmap to get decreasing order

    public static String sortByValue(HashMap<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
                 
        int i; char c;String ans="";
        
        for (Map.Entry<Character, Integer> aa : list) {
            
            i=aa.getValue().intValue();
            c=aa.getKey().charValue();
            
            for(;i>0;i--){
                ans+=c;
            }
        }
                
        return ans;
    }
    
    
    
}