class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        
        // for the flush
        
        if(suits[0]==suits[1] && suits[1]==suits[2] && suits[2]==suits[3] && suits[3]==suits[4])
            return "Flush";
        
        // for rest of the situations

        else{
            
            int max=0;
            
            HashMap<Integer, Integer> rankCount=new HashMap<>();
            
            for(int i:ranks){
                if(!rankCount.containsKey(i))
                    rankCount.put(i,1);
                
                else{
                    
                    int temp=rankCount.get(i)+1;
                    max=max>temp ? max : temp;
                    rankCount.put(i, temp);
                }
                
            }
            
            // if we are having even four ranks of same value... we will still consider it to be "Three of a Kind"
            if(max==3 || max==4)
                return "Three of a Kind";
            
            if(max==2)
                return "Pair";
            
            else
                return "High Card";
            
        }
        
        
    }
}