
/*
Thought of solving using the below code... 
failed for this test case


[8,9,1,5,4,3,6,4,3,7]
4


class Solution {
    public int minimizeMax(int[] nums, int p) {

        Arrays.sort(nums);

        int arDiff1[]=new int[nums.length/2];
        int arDiff2[];

        if(nums.length%2==0){
            arDiff2=new int[nums.length/2-1];
        }

        else{
            arDiff2=new int[nums.length/2];
        }

        int index=0;

        for(int i=0;i<nums.length-1;i++){
            arDiff1[index++]=nums[i+1]-nums[i];
            ++i;
        }

        index=0;

        for(int i=1;i<nums.length-1;i++){
            arDiff2[index++]=nums[i+1]-nums[i];
            ++i;
        }

        Arrays.sort(arDiff1);
        Arrays.sort(arDiff2);

        int diff=0;

        for(int i=0;i<p;i++){
            diff+=arDiff1[i];
        }

        int diff1=0;

        for(int i=0;i<p && i<arDiff2.length;i++){
            diff1+=arDiff2[i];
        }

        return diff>diff1 ? diff1 : diff;
        
    }
}
*/

class Solution {
    // Find the number of valid pairs by greedy approach
    private int countValidPairs(int[] nums, int threshold) {
        int index = 0, count = 0;
        while (index < nums.length - 1) {
            // If a valid pair is found, skip both numbers.
            if (nums[index + 1] - nums[index] <= threshold) {
                count++;
                index++;
            }
            index++;
        }
        return count;
    }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = nums[n - 1] - nums[0];

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If there are enough pairs, look for a smaller threshold.
            // Otherwise, look for a larger threshold.
            if (countValidPairs(nums, mid) >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}