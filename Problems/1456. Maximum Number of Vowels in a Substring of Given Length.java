// SUSHANT SINHA

/*

	my code has technically no errors
	just doesnt passes the test cases with k > 999
	but at the same time k > 999 is not allowed to be run

*/

// my solution

class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        
        for(int i=0;i<=s.length()-k;i++){
            
            int temp = len(s.substring(i,i+k));
            
            ans = ans > temp ? ans : temp;
            
            if(ans==k)return ans;
        }
        
        return ans;
        
    }
    
    static int len(String s){
        
        int l=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i')l++;
        }
        
        return l;
    }
}

