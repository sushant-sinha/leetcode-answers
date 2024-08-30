// SUSHANT SINHA

/*

below solution cannot handle cases when there are multiple characters with the same value:

for: 144363 and 134364
when I replace 3 at ones place, with 4 at thousands place, I get 143364, which is not same as 134364.
my algo should be able to look for the other 4 (at ten thousands place) and swap the 3 with it.

might choose recursion for v2 of solution

*/

class Solution {
    public int countPairs(int[] nums) {

        int ans=0;

        for(int i=0;i<nums.length-1;i++){

            // System.out.println("------------------- for "+nums[i]);

            for(int j=i+1;j<nums.length;j++){

                // System.out.println(nums[i]+" "+nums[j]+" "+isAlmostEqual(nums[i], nums[j]));
                ans+=isAlmostEqual(nums[i], nums[j]);

            }

            // System.out.println(ans);
        }

        return ans;
        
    }

    int isAlmostEqual(int a, int b){

        int ar1[]=new int[6];
        int ar2[]=new int[6];

        int index=6;

        while(a!=0){
            ar1[--index]=a%10;
            a/=10;
        }

        index=6;

        while(b!=0){
            ar2[--index]=b%10;
            b/=10;
        }

        return checkForSwap(ar1, ar2) || checkForSwap(ar2, ar1) ? 1 : 0;
        
    }

    boolean checkForSwap(int[] ar1, int[] ar2){

        // System.out.println(Arrays.toString(ar1)+" "+Arrays.toString(ar2));

        boolean isSwapped=false;

        for(int i=5;i>=0;i--){

            if(ar1[i]!=ar2[i]){

                if(isSwapped)
                    return false;

                boolean found = false;

                

                // check for swap in ar2
                for(int j=i-1;j>=0;j--){

                    // System.out.println(ar2[j]+" "+ar1[i]);
                    
                    if(ar2[j]==ar1[i]){

                        ar2[j]=ar2[i];
                        isSwapped=true;
                        found=true;
                        break;
                    }
                }

                if(!found)
                    return false;
            }

        }

        return true;
    }
}