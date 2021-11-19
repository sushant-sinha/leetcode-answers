// 9ms ( 89.22% ) 39.9mb ( 88.41% )

class Solution {
    public boolean winnerOfGame(String colors){
    
        int a=colors.indexOf("AAA");
        int b=colors.indexOf("BBB");

        while(a!=-1){
            
            if(b==-1)
                return true;
            
            b=colors.indexOf("BBB",b+1);
            a=colors.indexOf("AAA",a+1);
        }
        
        return false;
    }
}