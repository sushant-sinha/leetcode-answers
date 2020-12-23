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


public class Solution {
 /*
 * @param : A list of integers.
 * @return: A list of permutations.
 */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        helper(nums, new HashSet<Integer>(), new ArrayList<Integer>(), ret);
        
        return ret;
    }
    
    private void helper(int[] nums, HashSet<Integer> used, List<Integer> cur, List<List<Integer>> ret) {
        if (nums.length == used.size()) {
            ret.add(new ArrayList<Integer>(cur));
        }
        
        for (int i : nums) {
            if (used.contains(i)) {
                continue;
            }
            
            used.add(i);
            cur.add(i);
            helper(nums, used, cur, ret);
            used.remove(i);
            cur.remove(cur.size() - 1);
        }
    }
}



class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums , new int[nums.length] , ans , 1);
        return ans;
    }
    
    public void generate(int a[] , int visited[] , List<List<Integer>> ans , int count){
        if(count == a.length+1){
            List<Integer> now = new ArrayList<>();
            for(int i=0;i<a.length;i++)
                now.add(0);
            for(int i=0;i<a.length;i++){
                now.set(visited[i]-1 , a[i]);
            }
            ans.add(now);
            return;
        }
        
        for(int i=0;i<a.length;i++){
            if(visited[i] != 0)
                continue;
            visited[i] = count;
            generate(a , visited , ans , count+1);
            visited[i] = 0;
        }
        
    }
    
}