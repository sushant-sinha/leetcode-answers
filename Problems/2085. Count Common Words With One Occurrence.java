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
        
        return ans;
        
    }
}