class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashSet<Integer> set=new HashSet<>();

        int ans=0;

        for(int i:nums){
            if(set.contains(i)){
                ans^=i;
            }
            set.add(i);
        }

        return ans;
        
    }
}