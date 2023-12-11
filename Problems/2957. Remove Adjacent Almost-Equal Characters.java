class Solution {
    public int removeAlmostEqualCharacters(String word) {
        
        int ans=0;
        
        for(int i=0;i<word.length()-1;i++){
            
            if(Math.abs(word.charAt(i)-word.charAt(i+1))<=1){
                ans++;
                i++;
            }
            
        }
        
        return ans;
        
    }
}