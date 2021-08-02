class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length()+1];
        int left = 0;
        int right = s.length();
        
        for(int i = 0; i < res.length; i++){
            if(left == right){
                res[i] = left;
                break;
            }
            
            if(s.charAt(i) == 'I'){
                res[i] = left;
                left++;
            }
            
            else{
                res[i] = right;
                right--;
            }
        }
        
        return res;
    }
}