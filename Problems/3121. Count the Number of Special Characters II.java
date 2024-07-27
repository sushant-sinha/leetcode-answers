// SUSHANT SINHA

// 22ms ( 33.33% ) 45.28mb ( 100% )

class Solution {
    public int numberOfSpecialChars(String word) {

        // HashSet<Integer> seenUpperCase=new HashSet<>();

        int firstPositionOfUpperCase[]=new int[26];
        Arrays.fill(firstPositionOfUpperCase, -1);

        int lastPositionOfLowerCase[]=new int[26];
        Arrays.fill(lastPositionOfLowerCase, -1);

        int ans=0;

        char ar[]=word.toCharArray();

        for(int i=0;i<ar.length;i++){

            char c=ar[i];

            if(Character.isUpperCase(c)){
                if(firstPositionOfUpperCase[c-'A']==-1)
                    firstPositionOfUpperCase[c-'A']=i;
            }

            else{
                // if it is lowerCase
                lastPositionOfLowerCase[c-'a']=i;

            }

        }

        for(int i=0;i<26;i++){

            if(lastPositionOfLowerCase[i]!=-1 && firstPositionOfUpperCase[i]!=-1 && lastPositionOfLowerCase[i]<firstPositionOfUpperCase[i])
                ans++;
        }
        return ans;
        
    }
}