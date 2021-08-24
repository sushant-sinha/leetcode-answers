class Solution {
    public int minSteps(String s, String t) {
        
        int ar1[]=new int[26];
        
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            
            ar1[s.charAt(i)-'a']++;
            ar1[t.charAt(i)-'a']--;
            
        }
        
        for(int i:ar1)
            ans+= i>0 ? i : 0;
        
        return ans;
        
    }
}

