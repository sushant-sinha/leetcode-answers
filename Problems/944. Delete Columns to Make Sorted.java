class Solution {
    public int minDeletionSize(String[] strs) {
        
        int l=strs[0].length();
        int ans=0;
        
        for(int i=0;i<l;i++){
            for(int j=0;j<strs.length-1;){
                if((strs[j].charAt(i)-'a')>(strs[++j].charAt(i)-'a')){
                    ans++;
                    break;
                }
            }
        }
        
        return ans;
        
    }
}