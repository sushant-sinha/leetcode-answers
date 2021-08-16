class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int ans=0;
        
        for(String s:patterns){

            int len=s.length();
            
            for(int i=0;i<=word.length()-len;i++){

                if(word.substring(i,i+len).equals(s)){
                    ans++;
                    break;
                }
                
            }
        }
        
        return ans;
    }    
}