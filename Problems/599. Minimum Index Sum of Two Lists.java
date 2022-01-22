// SUSHANT SINHA

// approach 1 (personally preferred)

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap <Integer,List<String>> map = new HashMap <>();
        
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    
                    if (!map.containsKey(i + j))
                        map.put(i + j, new ArrayList < String > ());
                    
                    map.get(i + j).add(list1[i]);
                }
            }
        }
        
        int min_index_sum = Integer.MAX_VALUE;
        for (int key: map.keySet())
            min_index_sum = Math.min(min_index_sum, key);
        
        String[] res = new String[map.get(min_index_sum).size()];
        
        // to convert map to array
        return map.get(min_index_sum).toArray(res);
    }
}


// solution given in the solution the tab ( approach 2 )
// 43ms ( 16.03% ) 39.5mb ( 86.90% )

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List < String > res = new ArrayList < > ();
        for (int sum = 0; sum < list1.length + list2.length - 1; sum++) {
            for (int i = 0; i <= sum; i++) {
                if (i < list1.length && sum - i < list2.length && list1[i].equals(list2[sum - i]))
                    res.add(list1[i]);
            }
            if (res.size() > 0)
                break;
        }
        return res.toArray(new String[res.size()]);
    }
}