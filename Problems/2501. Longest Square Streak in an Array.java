// SUSHANT SINHA

// 55ms ( 34.22% ) 62.05mb ( 23.85% )

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



/*

// initially submitted this, which gave wrong answer for the last second test case.
// this was because I was using int for storing the products instead of Long.
// fixing this passed all test cases

class Solution {
    public int longestSquareStreak(int[] nums) {

        // Arrays.sort(nums);

        HashSet<Integer> set=new HashSet<>();

        int ans=0;

        for(int i: nums)
            set.add(i);

        for(int i: nums){

            if(!hasSquareRoot(i, set)){

                int cur=i, temp=0;

                while(set.contains(cur)){
                    temp++;
                    cur*=cur;
                }

                ans=Math.max(ans, temp);

            }
        }

        return ans==1 ? -1 : ans;
        
    }

    boolean hasSquareRoot(int i, HashSet<Integer> nums){

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

*/