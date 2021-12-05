// SUSHANT SINHA

// brute force

class Solution {
    public int numOfPairs(String[] nums, String target) {
        
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                
                if(i!=j){
                    if((nums[i]+nums[j]).equals(target))
                        ans++;
                }
                
            }
            
        }
        
        return ans;
        
    }
}

class Solution {
    public int numOfPairs(String[] nums, String target) {
        
        int[] suffix = new int[target.length() + 1];
        int[] prefix = new int[target.length() + 1];
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (target.startsWith(nums[i]))
                prefix[nums[i].length()]++;
            if (target.endsWith(nums[i]))
                suffix[nums[i].length()]++;
        }
        
        for (int i = 1; i < prefix.length; i++) {
            if (i == target.length() - i && (target.substring(0, i).equals(target.substring(i, target.length())))) 
                count += prefix[i] * (suffix[target.length() - i] - 1);
            else
                count += prefix[i] * suffix[target.length() - i];
        }

        return count;
    }


}
/*
// HASH MAP WITH STRINGS
        Map<String, Integer> suff = new HashMap<>();
        Map<String, Integer> pref = new HashMap<>();
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (target.startsWith(nums[i]))
                pref.put(nums[i], pref.getOrDefault(nums[i], 0) + 1);
            if (target.endsWith(nums[i]))
                suff.put(nums[i], suff.getOrDefault(nums[i], 0) + 1);
        }
        
        for (String s: pref.keySet()) {
            String suf = target.substring(s.length(), target.length());
            if (suff.containsKey(suf)) {
                if (suf.equals(s))
                    count += pref.get(s) * (suff.get(suf) - 1);
                else
                    count += pref.get(s) * suff.get(suf);
            }
        }
        return count;


        //BRUT FORCE:
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (target.equals(nums[i] + nums[j])) {
                        count++;
                    }
                        
                }
            }
        }
        return count;

*/