// first attempt

/*

class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length())
            return false;
        
        HashMap<Character, Integer> s1= helper(word1);
        HashMap<Character, Integer> s2= helper(word2);
        
        for (Map.Entry<Character,Integer> e : s1.entrySet()) {
            
            if(!s2.containsKey(e.getKey()))
                return false;
            
            
            if(!s2.containsValue(e.getValue()))
                return false;
            
        }
        
        for (Map.Entry<Character,Integer> e : s2.entrySet()) {
            
            if(!s1.containsKey(e.getKey()))
                return false;
            
            
            if(!s1.containsValue(e.getValue()))
                return false;
            
        }
        
        return true;
        
        
    }
    
    HashMap<Character, Integer> helper(String s){
        
        HashMap<Character, Integer> ans=new HashMap<>();
        
        for(char c:s.toCharArray()){
            
            ans.put(c, ans.getOrDefault(c,0)+1);
            
        }
        
        return ans;
        
    }
}

*/