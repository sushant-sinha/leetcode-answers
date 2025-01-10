// SUSHANT SINHA

// 14ms ( 27.63% ) 45.69MB ( 39.24% )

class Solution {
    public String answerString(String word, int numFriends) {

        if(numFriends==1)
            return word;

        String ans="";

        int len=word.length(), wordLen=len-numFriends+1;

        for(int i=0;i<len;i++){
            int end=i+wordLen;
            // System.out.println("original end = "+end);
            end= end > len ? len : end;

            // System.out.println(i+" "+end);

            String temp=word.substring(i, end);

            if(ans.compareTo(temp)<0)
                ans=temp;

            // System.out.println(temp);
        }
        return ans;
        
    }
}