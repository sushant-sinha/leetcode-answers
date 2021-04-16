// SUSHANT SINHA

// 1ms ( 52.15% ) 38.8mb ( 95.03% )

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

		ans.add(new ArrayList<>());
        
        /*
        
        take the number,
        create a new temp list(take all the list present in ans and add the number.)
        add this list to ans
        
        */

		for (int i : nums) {
            
			List<List<Integer>> temp = new ArrayList<>();
            
			for (List<Integer> list : ans) {
                
				List<Integer> newlist = new ArrayList<>();
				newlist.addAll(list);
				newlist.add(i);
				temp.add(newlist);
			}
            
			ans.addAll(temp);
		}

		return ans;
       
        
    }
}