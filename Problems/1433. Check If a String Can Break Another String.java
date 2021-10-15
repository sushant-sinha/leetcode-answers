class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        
        char ar1[]=s1.toCharArray();
        char ar2[]=s2.toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        s1=new String(ar1);
        s2=new String(ar2);
        
        //System.out.println(s1+" "+s2+" "+s1.compareTo(s2));
        
        if(s1.compareTo(s2)>=0){
            
            for(int i=0;i<s1.length();i++){
                
                if(ar1[i]<ar2[i]){
                    
                    return false;
                    
                }
            }
            
        }
        
        else{
            
            for(int i=0;i<s1.length();i++){
                
                if(ar1[i]>ar2[i]){
                    
                    return false;
                    
                }
            }
        }
                
        return true;
        
        
    }
}