class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        
        if(purchaseAmount<=10){
            
            if(purchaseAmount<5)
                return 100;
            
            if(purchaseAmount>=5)
                return 90;
        }
        
        else if(10<purchaseAmount && purchaseAmount<=20){
            
            if(purchaseAmount<15)
                return 90;
            
            if(purchaseAmount>=15)
                return 80;
            
        }
        
        else if(20<purchaseAmount && purchaseAmount<=30){
            
            if(purchaseAmount<25)
                return 80;
            
            if(purchaseAmount>=25)
                return 70;
            
        }
        
        else if(30<purchaseAmount && purchaseAmount<=40){
            
            if(purchaseAmount<35)
                return 70;
            
            if(purchaseAmount>=35)
                return 60;
            
        }
        
        else if(40<purchaseAmount && purchaseAmount<=50){
            
            if(purchaseAmount<45)
                return 60;
            
            if(purchaseAmount>=45)
                return 50;
            
        }
        
        else if(50<purchaseAmount && purchaseAmount<=60){
            
            if(purchaseAmount<55)
                return 50;
            
            if(purchaseAmount>=55)
                return 40;
            
        }
        
        else if(60<purchaseAmount && purchaseAmount<=70){
            
            if(purchaseAmount<65)
                return 40;
            
            if(purchaseAmount>=65)
                return 30;
            
        }
        
        else if(70<purchaseAmount && purchaseAmount<=80){
            
            if(purchaseAmount<75)
                return 30;
            
            if(purchaseAmount>=75)
                return 20;
            
        }
        
        else if(80<purchaseAmount && purchaseAmount<=90){
            
            if(purchaseAmount<85)
                return 20;
            
            if(purchaseAmount>=85)
                return 10;
            
        }
        
        else if(90<purchaseAmount && purchaseAmount<=100){
            
            if(purchaseAmount<95)
                return 10;
            
            if(purchaseAmount>=95)
                return 0;
            
        }
        
        return 0;
        
        
    }
}