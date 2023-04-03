class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);

        int len=potions.length;

        TreeMap<Long,Integer> map = new TreeMap<>();

        for(int i=0;i<potions.length;i++){

            if(!map.containsKey((long)potions[i])){
                map.put((long)potions[i], i);
            }

        }
        
        for(int i=0;i<spells.length;i++){

            long minPotionStrength = (success%spells[i] == 0) ? success/spells[i]-1 : success/spells[i];

            // System.out.println("for "+spells[i]+" min needed="+minPotionStrength);

            if(map.higherKey(minPotionStrength)!=null){
                // System.out.println("index="+map.get(map.higherKey(minPotionStrength)));
                spells[i]=len-map.get(map.higherKey(minPotionStrength));
            }
            else{
                spells[i]=0;
            }
        }

        return spells;
    }
}