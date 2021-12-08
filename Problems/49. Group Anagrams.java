class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        
        String temp="";
        
        for(String s:strs){
            
            char ar[]=s.toCharArray();
            Arrays.sort(ar);
            
            temp=String.valueOf(ar);
            
            if(!map.containsKey(temp)){
                
                map.put(temp,new ArrayList<String>());
                map.get(temp).add(s);
            }
            
            else
                map.get(temp).add(s);
            
        }
        
        List<List<String>> ans=new ArrayList<>();
        
        for(String s: map.keySet()){
            ans.add(map.get(s));
        }
        
        
        return ans;
        
    }
}