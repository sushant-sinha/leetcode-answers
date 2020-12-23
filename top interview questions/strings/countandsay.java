// SUSHANT SINHA

// Try once

class Solution {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder("1");
        while(n-- > 1){
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for(int i = 1; i < ans.length(); i++){
                if(ans.charAt(i) == ans.charAt(i - 1))
                    count++;
                else{
                    
                    temp.append(count);
                    temp.append(ans.charAt(i - 1));
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(ans.charAt(ans.length() - 1));
            ans = temp;
        }
        return ans.toString();
    }
}