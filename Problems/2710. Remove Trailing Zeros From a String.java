// SUSHANT SINHA

// 1ms ( 100% ) 43.9mb ( 60.12% )

class Solution {
    public String removeTrailingZeros(String num) {
        
        int index=num.length();
        
        for(int i=index-1 ;i>=0 ;i--){
            if(num.charAt(i)=='0'){
                index=i;
            }
            
            else
                break;
        }
        
        return num.substring(0,index);
        
    }
}