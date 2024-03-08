class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        
        int ans=0;
        
        for(int i=0;i<words.length-1;i++){
            
            for(int j=i+1; j<words.length; j++){
                
                if(words[j].length()<words[i].length())
                    continue;
                
                if(isPrefix(words[i], words[j]) && isSuffix(words[i], words[j]))
                    ans++;
            }
        }
        
        return ans;
        
    }
    
    boolean isPrefix(String a, String b){
        
        return b.indexOf(a) == 0;
    }
    
    boolean isSuffix(String a, String b){
        
        return b.lastIndexOf(a) == b.length()-a.length();
        
    }
    
}