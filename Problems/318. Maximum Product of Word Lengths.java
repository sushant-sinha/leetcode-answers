// SUSHANT SINHA

class Solution {
    public int maxProduct(String[] words) {
        
        int max=0;
        
        for(int i=0;i<words.length-1;i++){
            
            ArrayList<Character> s1=new ArrayList<>();
            
            for(char c:words[i].toCharArray()){
                if(!s1.contains(c))
                s1.add(c);
            }
            
            for(int j=1+i;j<words.length;j++){
                boolean repeated=false;
                
                for(char c:words[j].toCharArray()){
                    if(s1.contains(c)){
                        repeated=true;
                        break;
                    }
                    
                }
                
                if(repeated)
                    continue;
                else{
                    max= max>words[i].length()*words[j].length() ? max : words[i].length()*words[j].length();
                }
                
            }
            
        }
        
        return max;
        
    }
}