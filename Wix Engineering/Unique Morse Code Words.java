class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String alpha[]=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        ArrayList<String> transformed=new ArrayList<>();
        
        StringBuffer temp;
        
        for(String s:words){
            
            temp=new StringBuffer();
            
            for(char c:s.toCharArray()){
                
                temp.append(alpha[c-'a']);
                
            }
            
            String converted=temp.toString();
            
            if(!transformed.contains(converted))
                transformed.add(converted);
            
        }
        
        return transformed.size();
        
    }
}