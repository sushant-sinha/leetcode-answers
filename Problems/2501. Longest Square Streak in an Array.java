class Solution {
    public int longestSquareStreak(int[] nums) {

        // Arrays.sort(nums);

        HashSet<Long> set=new HashSet<>();

        int ans=0;

        for(int i: nums)
            set.add((long)i);

        for(int i: nums){

            if(!hasSquareRoot(i, set)){

                long cur=i; int temp=0;

                // System.out.print("in for="+cur);

                while(set.contains(cur)){
                    // System.out.print(" \t "+cur);
                    temp++;
                    cur=cur*cur;
                }

                // System.out.println();

                ans=Math.max(ans, temp);

            }
        }

        return ans==1 ? -1 : ans;
        
    }

    boolean hasSquareRoot(int i, HashSet<Long> nums){

        int sq=(int)Math.sqrt(i);

        if(sq*sq!=i)
            return false;

        else{
            if(nums.contains(sq))
                return true;

            else return false;
        }

    }
}