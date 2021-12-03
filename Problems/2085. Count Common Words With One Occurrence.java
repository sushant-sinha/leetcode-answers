// SUSHANT SINHA

// 4ms ( 96.92% ) 38.9mb ( 94.73% )

class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String,Integer> count = new HashMap<>();
        
        ArrayList<String> rem=new ArrayList<>();
        
        for(String s:words1){
            
            if(count.containsKey(s)){
                count.put(s,count.get(s)+1);
            }
            
            else{
                count.put(s,1);
            }
        }
        
        Iterator it=count.entrySet().iterator();
        
        while(it.hasNext()){
            
            Map.Entry element=(Map.Entry)it.next();
            
            if((int)element.getValue()>1)
                rem.add((String)element.getKey());
            
        }

        // had to use arraylist to store the keys which had the words appearing more than once in the first array..
        // removing the elements from the HashMap while iterating gives ConcurrentModificationException... so had to complete the iteration first.... then delete the elements from the HashMap

        // deleting the elements

        for(String s:rem){
            count.remove(s);
        }
        
        for(String s:words2){
            
            if(count.containsKey(s)){
                count.put(s,count.get(s)+1);
            }
        }
        
        int ans=0;
        
        it=count.entrySet().iterator();
        
        while(it.hasNext()){
            
            Map.Entry element=(Map.Entry)it.next();
            
            if((int)element.getValue()==2)
                ans++;
            
        }

        // using System.gc() below gives 5ms ( 77.82% ) 38.6mb ( 99.45% )
        // System.gc();
        
        return ans;
        
    }
}