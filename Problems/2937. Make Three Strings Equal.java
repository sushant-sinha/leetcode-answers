class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        
        if(s1.length()<2 || s2.length()<2 || s3.length()<2){
            if(s1.equals(s2) && s2.equals(s3))
            return 0;
        }
        
        int minLen = 0;
        
        if(s1.length()<s2.length()){
            if(s1.length()<s3.length()){
                minLen=s1.length();
            }
            
            else{
                minLen=s3.length();
            }
        }
        
        else{
            if(s2.length()<s3.length()){
                minLen=s2.length();
            }
            else
                minLen=s3.length();
            
        }
        
        int index=0;
        
        for(;index<minLen;index++){
            
            if(s1.charAt(index) == s2.charAt(index) && s2.charAt(index)==s3.charAt(index)){
                continue;
            }
            
            else{
                break;
            }
            
            
        }
        
        index--;
        
        // System.out.println(index);
        
        if(index>=0){
            
            return s1.length()-index-1 + s2.length() - index - 1 + s3.length() - index - 1;
            
        }
        
        else
            return -1;
        
    }
}