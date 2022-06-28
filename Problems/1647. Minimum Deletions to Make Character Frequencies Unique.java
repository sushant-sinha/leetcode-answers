class Solution {
    public int minDeletions(String s) {
        
        int freq[]=new int[26];
        
        for(char c:s.toCharArray()){
            
            freq[c-'a']--;
            
        }
        
        Arrays.sort(freq);
        
        for(int i=0;i<26;i++)
            freq[i]*=-1;
        
        //System.out.println(Arrays.toString(freq));
        
        int ans=0;
        
        for(int i=0; i<25; i++){
            
            boolean updated=false;
            
            for(int j=0; j<26; j++){
                
                if(j==i)
                    continue;
                
                if(freq[i]==freq[j]){
                    
                    if(freq[i]==0)
                        break;
                    
                    freq[i]--;
                    ans++;
                    updated=true;
                }
                
            }
            
            // System.out.println(Arrays.toString(freq));
            
            if(updated)
                i--;
            
        }
        
        return ans;
        
    }
}