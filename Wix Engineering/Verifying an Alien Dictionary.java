// SUSHANT SINHA

// 2ms ( 32.22% ) 40.8mb ( 92.63% )

class Solution {
    
    String or;
    
    public boolean isAlienSorted(String[] words, String order) {
        
        or=order;
        
        for(int i=0;i<words.length-1;i++){
            
            System.out.println(inOrder(words[i],words[i+1]));
            
            if(!inOrder(words[i],words[i+1]))
                return false;
            
        }
        
        return true;
        
    }
    
    boolean inOrder(String s1, String s2){
        
//         if(s1.length()>s2.length() && s2.equals(s1.substring(0,s2.length())))
//             return false;
        
//         if(s2.length()>s1.length() && s1.equals(s2.substring(0,s1.length())))
//             return true;
        
        int len = Math.min(s1.length(), s2.length());
        
        for(int i=0;i<len;i++){
            
            //System.out.println(or.indexOf(s1.charAt(i)) < or.indexOf(s2.charAt(i)));
            
            if(or.indexOf(s1.charAt(i)) < or.indexOf(s2.charAt(i)))
                return true;
            
            else if(or.indexOf(s1.charAt(i)) > or.indexOf(s2.charAt(i))) {
                return false;
            }
            
        }
        
        return false;
        
    }
}