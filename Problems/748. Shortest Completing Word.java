class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        String ans="zzzzzzzzzzzzzzzz";
        
        int charcount[]=new int[26];        
        
        
        for(char c:licensePlate.toLowerCase().toCharArray()){
            if(Character.isLetter(c))
                charcount[c-'a']++;
        }
        
        //System.out.println(Arrays.toString(charcount));
        
        
        for(String s:words){
            
            int words_count[]=new int[26];
            
            for(char c:s.toCharArray())                
                words_count[c-'a']++;
            
            //System.out.println(s+" "+Arrays.toString(words_count));
            
            boolean matched=true;
            
            for(int i=0;i<26;i++){
                
                if(charcount[i]!=0 && words_count[i]<charcount[i]){
                    matched=false;
                    break;
                }
                
            }
            
            //System.out.println(matched);
            
            if(matched && ans.length()>s.length())
                ans=s;
            
        }
        
        return ans;
        
    }
}