// SUSHANT SINHA

// 6ms 39.4mb

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int ans=0;        
        String sp[]=text.split("\\s");
        
        ArrayList<Character> br=new ArrayList<>();
        
        for(char c:brokenLetters.toCharArray()){
            
            br.add(new Character(c));
            
        }
        
        for(String s:sp){
            
            for(char c:s.toCharArray()){
                if(br.contains(c)){
                    ans++;
                    break;
                }
            }
            
        }
                
        return sp.length-ans;
        
    }
}