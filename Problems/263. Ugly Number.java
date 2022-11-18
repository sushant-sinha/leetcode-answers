// SUSHANT SINHA

class Solution {
    public boolean isUgly(int n) {
        
        if(n<1)
            return false;
        
        boolean isDiv=true;
            
        while(n!=0 && isDiv){
            
            isDiv=false;
            
            if(n%5==0){
                n/=5;
                isDiv=true;
            }
            
            if(n%3==0){
                n/=3;
                isDiv=true;
            }
            
            if(n%2==0){
                n/=2;
                isDiv=true;
            }
            
            //System.out.println(n+" "+isDiv);
            
        }
        
        return n==1 ? true : false;
        
    }
}