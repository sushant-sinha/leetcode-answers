// SUSHANT SINHA

// 1ms ( 99.49% ) 47.9mb ( 60.67% )

class Solution {
    public int longestSubarray(int[] A) {
        int i = 0, j, k = 1, res = 0;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (A[i] == 0) {
                    k++;
                }
                i++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    } 
}

class Solution {
    public int longestSubarray(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i++){
            int temp=i;
            int len1=0;
            int zero=0;
            while(i<nums.length && zero<2){
                if(nums[i]==1)
                    len1++;
                else
                    zero++;
                i++;
            }
            if(len1==nums.length)return len1-1;
            len = len1 > len ? len1 : len;
            i=temp++;
            
            
        }
        return len;
        
    }
}