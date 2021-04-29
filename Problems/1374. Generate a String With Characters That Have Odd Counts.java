// SUSHANT SINHA

class Solution {
    public String generateTheString(int n) {
        
        StringBuilder temp=new StringBuilder();
        
        for(int i=0;i<n-1;i++)
                temp.append("a");
        
        if(n%2==0){
            
            temp.append("b");
            return temp.toString();
            
        }
        else{
            
            temp.append("a");
            return temp.toString();
            
        }
        
    }
}