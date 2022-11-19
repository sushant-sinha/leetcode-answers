// SUSHANT SINHA

// 18/11/2022 solution
// 2ms ( 80.60% ) 41.4mb ( 43.22% )

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

// old solution
// 12/12/2020 
// 1ms 41.4mb

class Solution {
    public boolean isUgly(int num) {
        while (num != 0 && num % 5 == 0) num = num / 5;
        
        while (num != 0 && num % 3 == 0) num = num / 3;
        
        while (num != 0 && num % 2 == 0) num = num / 2;
        
        return num == 1;
    }
}
