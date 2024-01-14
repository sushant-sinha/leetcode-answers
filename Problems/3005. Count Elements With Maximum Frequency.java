// SUSHANT SINHA

// 2ms ( 73.56% ) 42.11mb ( 71.96% )
// can try doing it without HashMap as well

class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int max=1;
        
        HashMap<Integer, Integer> freq=new HashMap<>();
        
        for(int i:nums){
            
            if(freq.containsKey(i)){
                
                int newFreq=freq.get(i);
                
                max= max > ++newFreq ? max : newFreq;
                
                freq.put(i, newFreq);
                
            }
            
            else
                freq.put(i, 1);
            
        }
        
        int counter=0;
        
        for(Map.Entry<Integer, Integer> e: freq.entrySet()){
            if(e.getValue()==max)
                counter++;
        }
        
        return counter*max;
        
    }
}