class Solution {
    public int minOperations(int[] nums, int k) {
        
        TreeMap<Long, Integer> sortedNums = new TreeMap<>();
        
        int ans=0;
        
        for(int i:nums){
            if(sortedNums.containsKey((long)i))
                sortedNums.put((long)i, sortedNums.get((long)i)+1);
            
            else
                sortedNums.put((long)i, 1);
        }
        
        while(sortedNums.size()>=1 && sortedNums.firstKey()<k){
            
            long min=sortedNums.firstKey();
            
            int freqOfMin=sortedNums.get(min);
            
            if(freqOfMin==1){
                // remove this number from the map
                sortedNums.remove(min);
                
                // find the second smallest number to pair up with
                long min2=sortedNums.firstKey();
                
                int freqOfMin2=sortedNums.get(min2);
                
                if(freqOfMin2>1){
                    sortedNums.put(min2, freqOfMin2-1);
                }
                
                else
                    sortedNums.remove(min2);
                
                long newNum=(min*2 + min2);
                
                sortedNums.put(newNum, sortedNums.getOrDefault(newNum, 0)+1);
                
            }
            
            else if(freqOfMin==2){
                
                sortedNums.remove(min);
                
                long newNum=(3*min);
                
                sortedNums.put(newNum, sortedNums.getOrDefault(newNum, 0)+1);
                
            }
            
            else{
                sortedNums.put(min, freqOfMin-2);
                long newNum=(3*min);
                
                sortedNums.put(newNum, sortedNums.getOrDefault(newNum, 0)+1);
            }
            
            ans++;
            
        }
        
        return ans;
        
    }
}