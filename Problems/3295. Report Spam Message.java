// SUSHANT SINHA

// 49ms ( 91.36% ) 73.89mb ( 54.16% )

class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {

        HashSet<String> bannedWordsSet=new HashSet<>();
        
        int bannedWordCounter=0;

        for(String s: bannedWords)
            bannedWordsSet.add(s);

        for(String s: message){
            if(bannedWordsSet.contains(s))
                bannedWordCounter++;

            if(bannedWordCounter==2)
                return true;
        }

        return false;
        
    }
}