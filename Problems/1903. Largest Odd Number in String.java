// SUSHANT SINHA

// 2ms ( 60.18% ) 39.3mb ( 96.64% )

class Solution {
    public String largestOddNumber(String num) {
                
        for(int i=num.length()-1;i>=0;i--){
            if(Character.getNumericValue(num.charAt(i))%2!=0)
                return num.substring(0,i+1);
        }
        
        return "";
    }
}

// best solution
// 1ms ( 100% ) 39.7mb ( 82.10% )

class Solution {
    public String largestOddNumber(String num) {
                
        for(int i=num.length()-1;i>=0;i--){
            if (num.charAt(i)%2==1)
                return num.substring(0,i+1);
        }
        
        return "";
    }
}