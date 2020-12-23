// SUSHANT SINHA

public class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            ans.add(new ArrayList<Integer>());
            return ans;
        }
        
        // initiate the result list
        for (int num : nums) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(num);
            ans.add(temp);
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            List<List<Integer>> tmpRet = new ArrayList<List<Integer>>();
            // scan every list in result list for each number
            for (int num : nums) {
                for (List<Integer> list : ans) {
                    if (list.contains(num)) {
                        // only add new number to each list
                        continue;
                    }
                    List<Integer> temp = new ArrayList<Integer>(list);
                    temp.add(num);
                    tmpRet.add(temp);
                }
            }
            ans = tmpRet;
        }
        
        return ans;
    }
}