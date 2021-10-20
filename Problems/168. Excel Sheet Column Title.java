class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();

        while(columnNumber>0){
            
            int r=columnNumber%26;
            
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