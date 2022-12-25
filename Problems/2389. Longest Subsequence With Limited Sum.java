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