// SUSHANT SINHA

// 81ms ( 44.87% ) 104.2mb ( 39.65% )

class Solution {
    public int minimumRounds(int[] tasks) {

        // mapping the tasks and their frequency

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:tasks){

            map.put(i, map.getOrDefault(i,0)+1);

        }

        int ans=0;

        for(Map.Entry<Integer, Integer> e: map.entrySet()){

            int val=e.getValue();

            if(val==1)
            return -1;

            else if(val==2)
            ans+=1;

            else{

                if(val%3==0)
                ans+=val/3;

                else{
                    ans+=(val/3)+1;
                }

            }
        }

        return ans;
        
    }

}

// first approach
// This solution gave tle

class Solution {
    public int minimumRounds(int[] tasks) {

        // mapping the tasks and their frequency

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:tasks){

            map.put(i, map.getOrDefault(i,0)+1);

        }

        int ans=0;

        for(Map.Entry<Integer, Integer> e: map.entrySet()){

            int val=e.getValue();

            int x=helper(val, 0);

            if(x==-1)
            return -1;

            ans+=x;
        }

        return ans;
        
    }

    int helper(int a, int times){

        // System.out.println("cur value a="+a+" times="+times);

        if(a==0)
        return times;

        if(a<2)
        return -1;

        int three=helper((a-3), times+1);
        // System.out.println("three="+three);
        int two=helper((a-2), times+1);
        // System.out.println("two="+two);

        int ans= (three>0 && two>0 && three<two) || (three>0 && two<0) ? three : two;
        // System.out.println(ans);
        return ans;

    }
}