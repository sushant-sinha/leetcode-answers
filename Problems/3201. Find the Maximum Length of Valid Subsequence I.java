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

        if(oddStart!=-1){
            
            tempAns=subsequence(nums, oddStart, 0);
            ans=Math.max(ans, tempAns);

            tempAns=subsequence(nums, oddStart, 1);
            ans=Math.max(ans, tempAns);

        }

        if(evenStart!=-1){
            tempAns=subsequence(nums, evenStart, 0);
            ans=Math.max(ans, tempAns);

            tempAns=subsequence(nums, evenStart, 1);
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