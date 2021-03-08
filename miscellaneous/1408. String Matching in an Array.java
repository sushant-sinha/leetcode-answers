// SUSHANT SINHA

// 10ms ( 10.80% ) 39.3mb ( 41.92% )

class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<words.length-1;i++){
            
            for(int j=i+1;j<words.length;j++){
                
                String small=words[i].length()>=words[j].length() ? words[j] : words[i];
                String big=words[i].length()<words[j].length() ? words[j] : words[i];
                                
                if(issub(small,big)){
                    if(!ans.contains(small))
                    ans.add(small);
                    
                }
                
            }
            
            
        }
        
        return ans;
        
    }
    
    public boolean issub(String small, String big){
        
        for(int i=0;i<big.length()-small.length()+1;i++){
            if(small.equals(big.substring(i,i+small.length())))
                return true;
        }
        
        return false;
    }
}

class Solution {
    public List<String> stringMatching(String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String str : words)
            sb.append(" ").append(str);
        String allstr = sb.toString();
        
        List<String> result = new LinkedList<>();
        for(String str : words)
            if(allstr.indexOf(str) != allstr.lastIndexOf(str))
                result.add(str);
        
        return result;
    }
}