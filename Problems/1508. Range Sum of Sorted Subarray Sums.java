// SUSHANT SINHA

// 65ms ( 70.80% ) 46.30mb ( 56.56% )

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int[] newAr=new int[n*(n+1)/2+1];

        int index=0;

        for(int i=0;i<n;i++){

            int tempSum=0;

            for(int j=i;j<n;j++){

                tempSum+=nums[j];
                newAr[index++]=tempSum;

            }
        }
        
        Arrays.sort(newAr);

        int ans=0;

        for(;left<=right;left++){

            ans=(ans+newAr[left])%1000000007;
        }

        return ans;
    }
}