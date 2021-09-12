// reference

class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int[] res = new int[s.length()];
        int dist = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                dist = 0;
                res[i] = dist++;
            }
            
            else if (dist > 0){
                res[i] = dist++;
            } 
        }

        for (int i = s.length() - 1; i >= 0 ; i--){
            if (s.charAt(i) == c){
                dist = 0;
                res[i] = dist++;
            }
            else if (dist > 0 && (res[i] == 0  || dist < res[i])){
                res[i] = dist++;
            }
        }

        return res;

    }
}