// SUSHANT SINHA

// 114ms ( 56.95% ) 108.8mb ( 30.70% )

/*

very important for the traversal of the HashMap...
the type returned by the m.getValue() and m.getKey is Object..

these are needed to be converted to int and String before being used/assigned to max and ans respectively

for int:        (int)m.getValue();
for String:     String.valueOf(m.getKey());
or...for String (String)m.getKey();

*/

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String, Integer> counter=new HashMap<>();
        
        int n=messages.length;
        
        for(int i=0;i<n;i++){
            
            if(counter.containsKey(senders[i])){
                counter.put(senders[i], (counter.get(senders[i])+messages[i].split(" ").length));
            }
            
            else
                counter.put(senders[i], messages[i].split(" ").length);
            
        }
        
        // iterating the hashmap to find the maximum number of words and for tie-breaker comparing the two strings
        
        String ans="";
        int max=-1;
        
        for(Map.Entry m : counter.entrySet()){
            
            if((int)m.getValue()>max){
                max=(int)m.getValue();
                ans=(String)m.getKey();
                // another way of converting object to String
                // ans=String.valueOf(m.getKey());
            }
            
            else if((int)m.getValue()==max){
                
                ans= ans.compareTo((String)m.getKey())<0 ? (String)m.getKey() : ans;
                
            }
            
            //System.out.println(m.getKey()+" "+m.getValue());
        }
        
        return ans;
        
    }
}