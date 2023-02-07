// SUSHANT SINHA

// 51ms ( 5.70% ) 42mb ( 28.75% )

class Solution {
    public long pickGifts(int[] gifts, int k) {

        long sum=0;
        int len=gifts.length;
        ArrayList<Long> set=new ArrayList<>();

        for(long i:gifts){
            set.add(i);
            sum+=i;
        }

        while(k>0){

            Collections.sort(set);
            long i=set.get(len-1);
            set.remove(len-1);
            long sqrt=(long)Math.floor(Math.sqrt(i));
            set.add(sqrt);
            sum=sum-i+sqrt;

            k--;
        }

        return sum;
        
    }
}