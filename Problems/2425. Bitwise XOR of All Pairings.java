// SUSHANT SINHA

// SUSHANT SINHA

// 20ms (9.01%) 64.85MB ( 6.16% )
// Too slow, see the editorial for correct bit manipulation solution

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

        int ans=0;

        HashSet<Integer> nums=new HashSet<>();

        int len1=nums1.length, len2=nums2.length;

        for(int i=0;i<nums1.length;i++){
            if(nums.contains(nums1[i])){
                if(len2%2==1)
                    nums.remove(nums1[i]);
            }
            else{
                if(len2%2==1)
                nums.add(nums1[i]);
            }
        }
        
        for(int i=0;i<nums2.length;i++){
            if(nums.contains(nums2[i])){
                if(len1%2==1)
                    nums.remove(nums2[i]);
            }
            else{
                if(len1%2==1)
                nums.add(nums2[i]);
            }
        }

        for(int i: nums){
            ans^=i;
        }

        return ans;

    }
}

// write a frequency based approach
// use the commutative property (order doesn't matter) and x^x = 0 and x^0=x