// SUSHANT SINHA

// 2ms ( 76.50% ) 40.4mb ( 87.10% )

// check the two solutions from the editorial

class Solution {
    public String reorganizeString(String s) {

        StringBuilder ans=new StringBuilder();

        // can optimize using an arraylist
        int count[]=new int[26];

        int maxFreq=0;

        for(char c:s.toCharArray()){

            count[c-'a']++;

            if(maxFreq<count[c-'a']){

                maxFreq=count[c-'a'];

                ans.delete(0,1);
                ans.append(c);
            }

        }

        // System.out.println(ans);

        count[ans.charAt(0)-'a']--;

        while(ans.length()!=s.length()){

            char c=findMaxNotEqualToC(count, ans.charAt(ans.length()-1));

            if(c==' ')
                return "";

            else{
                ans.append(c);
                count[c-'a']--;
            }

        }

        // System.out.println(Arrays.toString(count));
        return String.valueOf(ans);
        
    }

    char findMaxNotEqualToC(int count[], char c){

        char ans=' ';
        int maxFreq=0;

        for(int i=0;i<26;i++){

            if(maxFreq<count[i] && (char)(i+'a')!=c){
                maxFreq=count[i];
                ans=(char)(i+'a');
            }

        }

        return ans;

    }
}