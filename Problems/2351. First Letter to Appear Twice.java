// SUSHANT SINHA

// 0ms ( 100% ) 42mb ( 25.00% )

class Solution {
    public char repeatedCharacter(String s) {
        
        byte ar[]=new byte[26];
        
        for(char c: s.toCharArray()){
            
            if(ar[c-'a']==1)
                return c;
            
            else
                ar[c-'a']++;
            
        }
        
        return ' ';
        
    }
}


// 1ms 40.1mb

class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character, Integer> count=new HashMap<>();
        
        for(char c:s.toCharArray()){
            
            if(!count.containsKey(c))
                count.put(c, 1);
            
            else{
                if(count.get(c)==1)
                    return c;
                else
                    continue;
            }
            
        }
        
        return ' ';
        
    }
}