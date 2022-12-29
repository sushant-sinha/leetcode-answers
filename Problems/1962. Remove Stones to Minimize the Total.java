class Solution {
    public int minStoneSum(int[] piles, int k) {

        int sum=0, len=piles.length;

        // System.out.println((7-(Math.floor(7/2))));
        // System.out.println((7-(Math.floor(7/2)))<=7/2);
        // System.out.println((6-(Math.floor(6/2)))<=6/2);

        TreeMap<Integer, Integer> map=new TreeMap<>();

        for(int i:piles){

            sum+=i;

            map.put(i, map.getOrDefault(i, 0)+1);
        }

        while(k!=0){

            int key=map.lastKey();
            int diff=key/2;

            int keyVal=map.get(key);

            // System.out.println("after choosing "+key+" "+diff+" "+sum);

            if(keyVal==1){
                map.remove(key);
            }

            else{
                map.put(key, keyVal-1);    
            }

            map.put(key-diff, map.getOrDefault(key-diff, 0)+1);

            sum-=diff;

            k--;
        }

        return sum;
        
    }
}