// SUSHANT SINHA

// 11ms ( 80.17% ) 40mb ( 81.79% )
// https://leetcode.com/sauyee183/

class Solution {
    public String maximumNumber(String num, int[] change) {
        int start = -1;
        char[] charArr = num.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {
            
            //converting char to string
            int j = charArr[i] - '0';
            
            if(change[j] > j) {
                
                if(start < 0) {
                    start = i;
                }
                
                //converting int to char
                charArr[i] = (char) (change[j] + '0');
                
            }
            else if(change[j] < j){
                if(start >= 0)
                    break;
            }
        }
        
        return String.valueOf(charArr);
    }
}
