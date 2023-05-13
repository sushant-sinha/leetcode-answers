// SUSHANT SINHA

// 73ms ( 28.18% ) 102.3mb ( 76.11% )

class FrequencyTracker {

    int ar[];
    int freq[];

    public FrequencyTracker() {
        ar=new int[100001];
        freq=new int[100001];
    }
    
    public void add(int number) {
        freq[ar[number]]--;
        ar[number]++;
        freq[ar[number]]++;
    }
    
    public void deleteOne(int number) {

        if(ar[number]>0){
            
            freq[ar[number]]--;
            ar[number]--;
            freq[ar[number]]++;
            
        }
        
    }
    
    public boolean hasFrequency(int frequency) {
        
        return freq[frequency] > 0 ;
    }
}

// old code using one hashmap gives TLE

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */

 /*

class FrequencyTracker {
    
    HashMap<Integer, Integer> freq;

    public FrequencyTracker() {
        
        freq=new HashMap<>();
        
    }
    
    public void add(int number) {
        
        if(freq.containsKey(number)){
            freq.put(number, freq.get(number)+1);
        }
        
        else
            freq.put(number, 1);
        
    }
    
    public void deleteOne(int number) {
        
        if(freq.containsKey(number)){
            int val = freq.get(number);
            
            if(val==1)
                freq.remove(number);
            
            else
                freq.put(number, freq.get(number)-1);
        }
        
    }
    
    public boolean hasFrequency(int frequency) {
        
        if(freq.containsValue(frequency)){
            return true;
        }
        
        return false;
        
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */