class Solution {
    public int percentageLetter(String s, char letter) {
        
        int counter=0;
        
        for(char c:s.toCharArray()){
            
            System.out.println(c==letter);
            
            if(c==letter)
                counter++;
            
        }
        
        return counter*100/s.length();
        
    }
}