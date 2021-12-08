// SUSHANT SINHA

// 10ms ( 52.34% ) 53.5mb ( 12.90% )

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

// if we just replace the if-else with just the if statement... because we are adding the string to the arraylist of hashmap anyways 

// 6ms ( 83.50% ) 41.5mb ( 99.50% )

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        
        String temp="";
        
        for(String s:strs){
            
            char ar[]=s.toCharArray();
            Arrays.sort(ar);
            
            temp=String.valueOf(ar);
            
            if(!map.containsKey(temp))                
                map.put(temp,new ArrayList<String>());
            
            map.get(temp).add(s);
            
        }
        
        List<List<String>> ans=new ArrayList<>();
        
        for(String s: map.keySet()){
            ans.add(map.get(s));
        }
        
        
        return ans;
        
    }
}