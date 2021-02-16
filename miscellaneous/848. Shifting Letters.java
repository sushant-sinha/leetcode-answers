// SUSHANT SINHA

class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        char[] ch = S.toCharArray();
        int cum_shift = 0;
        
        // loop over the characters reversed and keep track of the updated shift value
        for(int i = ch.length-1; i >= 0; i--){
            cum_shift += shifts[i];
            cum_shift %= 26;
            // 'a' is subtracted and added so that the ch[i] value does not go to uncertain values
            ch[i] = (char) ((ch[i] - 'a' + cum_shift)%26 + 'a');
        }
        
        // return the string value
        return String.valueOf(ch);
    }
}