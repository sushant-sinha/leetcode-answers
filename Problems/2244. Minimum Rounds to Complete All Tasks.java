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