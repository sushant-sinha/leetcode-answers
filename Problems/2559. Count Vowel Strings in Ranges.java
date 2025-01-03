// SUSHANT SINHA

// 4ms ( 97.74% ) 85.88MB ( 48.50% )

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int[] prefix=new int[words.length+1];

        prefix[0]=0;

        for(int i=0;i<words.length;i++){

            prefix[i+1]=prefix[i];

            if(isStartingAndEndingWithVowel(words[i]))
                prefix[i+1]+=1;

        }

        // System.out.println(Arrays.toString(prefix));

        int[] ans=new int[queries.length];

        for(int i=0;i<queries.length;i++){

            ans[i]=prefix[queries[i][1]+1]-prefix[queries[i][0]];
        }

        return ans;
        
    }

    boolean isStartingAndEndingWithVowel(String s){

        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1));
    }

    boolean isVowel(char c){

        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}