// SUSHANT SINHA

// 18ms ( 35.07% ) 54.70mb ( 21.97% )

class Solution {
    public long minimumPossibleSum(int n, int target) {

        if(n==1)
            return 1;

        HashSet<Long> seen=new HashSet<>();
        seen.add((long)1);

        long sum=1, cur=1;

        for(int i=1;i<n;i++){
            cur++;

            cur=findNext(seen, cur, target);
            seen.add(cur);

            sum+=cur;

        }

        return sum;
        
    }

    long findNext(HashSet<Long> seen, long cur, int target){

        if(!seen.contains((target-cur)))
            return cur;

        while(seen.contains(target-cur)){
            cur++;
        }

        return cur;
    }
}