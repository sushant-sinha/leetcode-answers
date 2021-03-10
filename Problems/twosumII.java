// SUSHANT SINHA

// slower solution

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int i=0,j=0;
//         while(i<(numbers.length-1)){
//             j=i+1;
//             while(j<numbers.length){
//                 if(numbers[i]+numbers[j]==target){
//                     return new int[]{++i,++j};
//                 }
//                 ++j;
//             }
//             ++i;
//         }
        
//         return new int[0];
//     }
// }

// faster solution

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target)
                r--;
            else if (sum < target)
                l++;
            else
                return new int[] { l + 1, r + 1 };
        }
        return new int[0];
    }
}