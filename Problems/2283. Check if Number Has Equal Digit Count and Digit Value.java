class Solution {
    public boolean digitCount(String num) {
        
        int count[]=new int[10];
        
        int index=0;
        
        for(char c:num.toCharArray()){
            
            int n=Character.getNumericValue(c);
            
            count[index++]=n;
        
        }
        
        for(int i=0;i<10;i++){
            
            int occurence=0;
            
            for(char c:num.toCharArray()){
                
                if(Character.getNumericValue(c)==i)
                    occurence++;
                
            }
            
            if(occurence!=count[i])
                return false;
            
        }
        
        return true;
        
    }
}