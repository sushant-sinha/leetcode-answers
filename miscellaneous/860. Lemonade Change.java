// SUSHANT SINHA

class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int d5=0,d10=0,d20=0;
        
        for(int i=0;i<bills.length;i++){
            
                        
            if(bills[i]==5){
                d5++;
                continue;
            }
            if(bills[i]==10){
                
                if(d5>0){
                    d5--;d10++;
                    continue;
                }
                else {
                    return false;
                }
                
            }
            
            if(bills[i]==20){
                
                if(d5>0 && d10>0){
                    d5--;d10--;
                    continue;
                    
                }
                else if(d5>=3){
                    d5-=3;
                    continue;
                }
                
                else{
                    return false;
                }
                
            }
            
            
            
        }
        
        return true;
        
    }
}