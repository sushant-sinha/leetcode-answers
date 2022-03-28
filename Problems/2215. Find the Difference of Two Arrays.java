class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int x : nums1)
            map.put(x, 1);
        
        
        for (int x : nums2) {
            
            if (map.containsKey(x)) {
                
                if (map.get(x) == 1)
                    map.put(x, 0);
            }
            
            else
                map.put(x, 2);
        }
        
        for (int k : map.keySet()) {
            
            if (map.get(k) == 1) {
                list1.add(k);
            }
            else if (map.get(k) == 2) {
                list2.add(k);
            }
        }
        
        ans.add(list1);
        ans.add(list2);
        
        return ans;
    }
}