class Solution {
    public String answerString(String word, int numFriends) {

        String ans="";

        int len=word.length(), wordLen=len-numFriends+1;

        for(int i=0;i<len;i++){
            int end=i+wordLen;
            // System.out.println("original end = "+end);
            end= end > len ? len-1 : end;

            // System.out.println(i+" "+end);

            String temp=word.substring(i, end);

            if(ans.compareTo(temp)<0)
                ans=temp;

            // System.out.println(temp);
        }
        return ans;
        
    }
}