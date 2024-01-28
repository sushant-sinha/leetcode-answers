// SUSHANT SINHA

// 12ms ( 26.34% ) 44.73mb ( 26.75% )
// huge scope of optimization (for both, memory and run time)

class Solution {

    HashMap<Integer, Integer> setBit=new HashMap<>();

    public boolean canSortArray(int[] nums) {

        int ar[]=new int[nums.length];
        HashSet<Integer> sortedIndex=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            ar[i]=nums[i];
            
            if(!setBit.containsKey(ar[i])){
                setBit.put(ar[i], countSetBits(ar[i]));
            }
        }

        Arrays.sort(ar);

        // checking whether nums is already sorted or not

        boolean sorted=true;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=ar[i]){
                sorted = false;
                break;
            }
        }

        if(sorted)
            return true;
        
        for(int i=0;i<nums.length;i++){

            int curNum=ar[i];
            int indexInNums=0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]==curNum && !sortedIndex.contains(j)){
                    indexInNums=j;
                    break;
                }
            }

            if(!swapper(curNum, indexInNums, i, nums))
                return false;

            sortedIndex.add(indexInNums);
        }

        return true;
        
    }

    // for checking if the number can swapped from its current position to the correct position
    boolean swapper(int numToBeSwapped, int currentIndex, int correctIndex, int ar[]){

        int start = Math.min(correctIndex, currentIndex);
        int end = Math.max(correctIndex, currentIndex);
        int setBitCount = setBit.get(numToBeSwapped);

        for(; start<=end; start++){

            if(setBit.get(ar[start])!=setBitCount)
                return false;

        }

        return true;
    }

    // count the number of set bits in the number
    // taken from GFG, didn't had enough brain power to code it myself🤣
    int countSetBits(int n)
    {
        int ans = 0;

        while (n>0) {
            ans += n & 1;
            n >>= 1;
        }
        return ans;
    }
}