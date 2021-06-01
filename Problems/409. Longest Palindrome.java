// SUSHANT SINHA

class Solution {
    public int longestPalindrome(String s) {
        
        int lower[]=new int[26];
        int upper[]=new int[26];
        
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower[c-'a']++;
                
            }
            else{
                upper[c-'A']++;
            }
        }
        
        int ans=0,odd=0;
        
        for(int i:lower){
            if(i%2==0)
                ans+=i;
            else{
                
                if(odd<=i){
                    if(odd==0){
                        odd=i;
                    }
                    else{
                        ans+=odd-1;
                        odd=i;
                    }
                }
                else{
                    ans+=i-1;
                }
            }
        }
        
        for(int i:upper){
            if(i%2==0)
                ans+=i;
            else{
                
                if(odd<=i){
                    if(odd==0){
                        odd=i;
                    }
                    else{
                        ans+=odd-1;
                        odd=i;
                    }
                }
                else{
                    ans+=i-1;
                }
            }
        }
        
        return ans+odd;
        
    }
}