// SUSHANT SINHA

// 2ms ( 95.04% ) 39.1mb ( 65.09% )

class Solution {
    public List<String> commonChars(String[] A) {
        
        int ar[]=new int[26];
        
        for(char c:A[0].toCharArray()){
            ar[c-'a']++;
        }
        
        
        for(int i=1;i<A.length;i++){
            
            int temp[]=new int[26]; 
            
            for(char c:A[i].toCharArray()){
                temp[c-'a']++;
            }
            
            for(int j=0;j<26;j++){
                ar[j] = ar[j] > temp[j] ? temp[j] : ar[j];
            }
            
        }
                
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i];j++){
                
                ans.add(Character.toString((char)(i+97)));
                
            }
        }
        
        return ans;
        
    }
}