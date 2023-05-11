// SUSHANT SINHA

// 14ms ( 82.33% ) 43mb ( 76.32% )

class Solution {
    public int maxVowels(String s, int k) {

        int ans=0, cur=0;

        for(int i=0;i<s.length();++i){

            if((i-k>=0) && isVowel(s.charAt(i-k)) ){
                cur--;
            }

            if(isVowel(s.charAt(i))){
                cur++;
            }

            ans = cur>ans ? cur : ans;

        }

        return ans;
        
    }

    boolean isVowel(char c){

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        return true;

        return false;

    }
}