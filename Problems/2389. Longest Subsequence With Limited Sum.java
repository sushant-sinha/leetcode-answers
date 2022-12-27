// SUSHANT SINHA

// 6ms ( 84.75% ) 43mb ( 85.51% )

// since we dont need to keep the order in mind (because we just care about the sum of the elements and not where they are occuring)
// we can keep the sum of all the elements (prefix sum) of the 👉🏼sorted👈🏼 array
// then just search (here it is sequential... but you can use binary search for better tc) for the index where the sum exceeds the needed sum

// to find max sum=3
// [1,2,88,8,7,4,3,5] for this array the answer will be [1,2]
// [1,5,88,8,7,4,3,2] for this array as well the answer will be [1,2]

// so irrespective of the index.. we get the same answer as the prefix sum array of the 👉🏼sorted👈🏼 i/p array will be same




class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }

        // System.out.println(Arrays.toString(nums));

        for(int i=0;i<queries.length;i++){
            queries[i]=find(queries[i], nums);
        }

        return queries;
        
    }

    int find(int x, int ar[]){
        
        if(ar[0]>x)
        return 0;

        int i=0, len=ar.length;
        // System.out.println(ar[0]+" "+x+" "+ar[i]+" "+(x<=ar[i]));

        while(i<len && x>=ar[i]){
            i++;
        }

        return i;

    }
}