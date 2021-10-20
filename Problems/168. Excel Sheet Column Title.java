// SUSHANT SINHA

// 0ms ( 100% ) 35.7mb ( 98.65% )

class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();
        
        int r;

        while(columnNumber>0){
            
            r=columnNumber%26;
            
            if(r==0){
                r+=26;
                columnNumber--;
            }
            
            sb.append((char)(r+64));
            columnNumber/=26;
            
        }
        
        sb.reverse();
        return sb.toString();

    }
}