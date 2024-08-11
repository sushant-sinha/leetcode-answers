class Solution {
    public int winningPlayerCount(int n, int[][] pick) {

        int ans=0;

        HashMap<Integer, int[]> map=new HashMap<>();

        for(int i[]:pick){

            int[] temp;

            if(map.containsKey(i[0])){
                temp=map.get(i[0]);
            }

            else{
                temp=new int[11];
            }
            temp[i[1]]++;
            map.put(i[0], temp);
        }

        for(Map.Entry e: map.entrySet()){

            // int[] temp=(int[])e.getValue();

            int max=0;

            // System.out.println(temp);

            for(int i: (int[])e.getValue())
                max=Math.max(max, i);

            if((int)e.getKey()<max)
                ans++;

        }

        return ans;
        
    }
}