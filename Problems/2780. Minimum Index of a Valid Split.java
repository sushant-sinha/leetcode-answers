class Solution {
    public int minimumIndex(List<Integer> nums) {
        
        // will find the dominant element first
        
        int dominant=-1, maxFreq=Integer.MIN_VALUE, len=nums.size();
        
        HashMap<Integer, Integer> freq=new HashMap<>();
        
        for(int i:nums){
            
            if(freq.containsKey(i)){
                int curFreq=freq.get(i)+1;
                
                if(maxFreq<curFreq){
                    maxFreq=curFreq;
                    dominant=i;
                }
                
                freq.put(i, curFreq);
            }
            
            else{
                freq.put(i, 1);
            }
        }
        
        // check for the index where the frequency of dominant element * 2 is > index
        // now count the number of values after this (len-i), and check if the remainder frequency of dominant * 2 > (len-i)
        
        int curFreq=0;
        
        for(int i=0;i<len;i++){
            
            if(nums.get(i)==dominant){
                
                maxFreq--;
                curFreq++;
                
                // System.out.println(i+" "+curFreq+" "+(curFreq*2>(i+1))+" "+(maxFreq*2 > (len-i-1)));
                
                if(curFreq*2>(i+1)){
                    if(maxFreq*2 > (len-i-1))
                        return i;
                }
                
            }
            
        }
        
        return -1;
    }
}