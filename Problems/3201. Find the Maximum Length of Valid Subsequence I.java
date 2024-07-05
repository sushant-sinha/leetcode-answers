// SUSHANT SINHA

// 14ms ( 33.33% ) 62.21mb ( 100% )

class Solution {
    public int maximumLength(int[] nums) {

        if(nums.length==2)
            return 2;

        int ans=0;

        for(int i=0;i<nums.length;i++)
            nums[i]%=2;

        int evenStart=findIndex(nums, 0);
        int oddStart=findIndex(nums,1);

        int tempAns=0;

        // function protocoal -> int: subsequence(int array, startindex, pairity)

        if(oddStart!=-1){
            // case 1: when %2==0, starts with odd
            tempAns=subsequence(nums, oddStart, 0);
            // System.out.println("case 1 "+tempAns);
            ans=Math.max(ans, tempAns);

            // case 2: when %2==1, starts with odd
            tempAns=subsequence(nums, oddStart, 1);
            // System.out.println("case 2 "+tempAns);
            ans=Math.max(ans, tempAns);

        }

        if(evenStart!=-1){
            // case 3: when %2==0, starts with even
            tempAns=subsequence(nums, evenStart, 0);
            // System.out.println("case 3 "+tempAns);
            ans=Math.max(ans, tempAns);

            // case 4: when %2==1, starts with even
            tempAns=subsequence(nums, evenStart, 1);
            // System.out.println("case 4 "+tempAns);
            ans=Math.max(ans, tempAns);

        }

        return ans;
        
    }

    int subsequence(int ar[], int index, int pairity){

        int len=1;

        for(int i=index; i<ar.length;){
            
            int curPair=ar[i];

            int tempIndex=i;

            

            if(curPair==0 && pairity==0 || curPair==1 && pairity==1){
                
                // find 0
                // System.out.println("inside 1 "+tempIndex);
                tempIndex++;
                while(tempIndex<ar.length){
                    if(ar[tempIndex]==0){
                        len++;
                        break;
                    }
                    tempIndex++;
                }
            }

            else if(curPair==1 && pairity==0 || curPair==0 && pairity==1){
                
                tempIndex=i;
                // System.out.println("inside 2 "+tempIndex);
                // find 1
                tempIndex++;
                while(tempIndex<ar.length){
                    if(ar[tempIndex]==1){
                        len++;
                        break;
                    }
                    tempIndex++;
                }
            }

            i=tempIndex;

        }

        return len;
    }

    int findIndex(int ar[], int mod){

        for(int i=0;i<ar.length;i++)
            if(ar[i]==mod)
                return i;
        
        return -1;
    }
}