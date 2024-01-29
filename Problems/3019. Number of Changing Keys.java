class Solution {
    public int countKeyChanges(String s) {
        
        int ans=0;
        
        char prev=s.charAt(0);
        
        for(int i=1;i<s.length();i++){
            
            char cur=s.charAt(i);
            
            boolean keyChange=!(prev==cur || Math.abs(prev-cur)==32);
            
            if(keyChange)
                ans++;
            
            prev=cur;
            
        }
        
        return ans;
        
    }
}