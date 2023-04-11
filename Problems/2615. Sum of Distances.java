// https://leetcode.com/problems/sum-of-distances/solutions/3395732/ltr-rtl/
// https://leetcode.com/problems/sum-of-distances/solutions/3395871/easy-and-intuitive-approach-mathematical-derivation-c/

/*
class Solution {
    public long[] distance(int[] nums) {
        
        // mapping of number and index 
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        
        int len=nums.length;
        
        long ans[]=new long[len];
        
        for(int i=0; i<len; i++){
            
            ArrayList<Integer> temp;
            
            if(map.containsKey(nums[i])){
                
                temp = map.get(nums[i]);
                temp.add(i);
                map.put(nums[i], temp);
            }
            
            else{
                
                temp = new ArrayList<>();
                temp.add(i);
                map.put(nums[i], temp);
            }
            
        }

        // it might give TLE if I don't optimize the sum calculation: use prefix sum
        
        return ans;
        
    }
}
*/
class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long res[]=new long[n];
        HashMap<Integer,Long> cnt_l=new HashMap<>();
        HashMap<Integer,Long> cnt_r=new HashMap<>();
        HashMap<Integer,Long> sum_l=new HashMap<>();
        HashMap<Integer,Long> sum_r=new HashMap<>();

        for(int i=0;i<n;i++){
            res[i]+=cnt_l.getOrDefault(nums[i],0l)*i-sum_l.getOrDefault(nums[i],0l);
            cnt_l.put(nums[i],cnt_l.getOrDefault(nums[i],0l)+1);
            sum_l.put(nums[i],sum_l.getOrDefault(nums[i],0l)+i);
        }
        for(int i=n-1;i>=0;i--){
            res[i]+=sum_r.getOrDefault(nums[i],0l)-cnt_r.getOrDefault(nums[i],0l)*i;
            cnt_r.put(nums[i],cnt_r.getOrDefault(nums[i],0l)+1);
            sum_r.put(nums[i],sum_r.getOrDefault(nums[i],0l)+i);
            
        }
        return res;
    }
}