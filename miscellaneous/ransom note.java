// SUSHANT SINHA

// My solution

class Solution {
    public boolean canConstruct(String r, String m) {
        
        if(r.equals(""))return true;
        
        char r1[]=r.toCharArray();
        char m1[]=m.toCharArray();
        
        boolean flag=true;
        
        for(char x:r1){
        
            flag=true;
            for(int i=0;i<m1.length;i++){
                
                if(x==m1[i]){
                    m1[i]=5;
                    flag=false;
                    break;
                }
                
            }
            
            if(flag)break;
            
        }
            
        return !flag;
    }
}

