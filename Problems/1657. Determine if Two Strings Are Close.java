// SUSHANT SINHA

// 32ms ( 49.62% ) 54.2mb ( 70.45% )

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

// the above code passed 150/152 tc

class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length())
            return false;
        
        int ar1[]=new int[26];
        int ar2[]=new int[26];
        
        for(int i=0;i<word1.length();i++){
            ar1[word1.charAt(i)-'a']++;
            ar2[word2.charAt(i)-'a']++;
        }
        
        // characters should be present in both the strings
        for(int i=0;i<26;i++)
            if((ar1[i]!=0 && ar2[i]==0) || (ar1[i]==0 && ar2[i]!=0))
                return false;
        
        // checking whether the equal frequencies are present in both words
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        for(int i=0;i<26;i++){
            
            if(ar1[i]!=ar2[i])
                return false;
            
        }
        
        return true;
        
        
    }
}