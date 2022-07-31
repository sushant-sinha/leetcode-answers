class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        // this solution is giving TLE.... need to use a hashmap for the mapping of the elements in the words2 and the elements in the words1
        
        List<String> ans=new ArrayList<>();
        
        List<int[]> indCounter=new ArrayList<>();
        
        int n=words2.length;
        
        for(String s:words2){
            
            int ar[]=new int[26];
            
            for(char c:s.toCharArray())
                ar[c-'a']++;
            
            indCounter.add(ar);
            
        }
        
        for(String s: words1){
            
            int temp[]=new int[26];
            boolean flag=true;
            
            for(char c:s.toCharArray()){
                temp[c-'a']++;
            }
            
            for(int x=0;x<n;x++)
            for(int i=0;i<26;i++){
                
                int curr[]=indCounter.get(x);
                
                if(!(temp[i]>=curr[i])){
                    flag=false;
                    break;
                }
                
            }
            
            if(flag)
                ans.add(s);
            
            
            
        }
        
        return ans;
        
    }
}