class Solution {
    public int minBitFlips(int start, int goal) {

        int ans=0;

        String s1=toBinary(start);
        String s2=toBinary(goal);

        if(s1.length()>s2.length()){

            int lenDiff=s1.length()-s2.length();

            // appending zeroes
            for(int i=0;i<lenDiff; i++)
                s2="0"+s2;

            for(int i=0;i<s1.length();i++){

                if(s1.charAt(i)!=s2.charAt(i))
                ans++;

            }

        }

        else{

            int lenDiff=s2.length()-s1.length();

            for(int i=0;i<lenDiff; i++){

                s1="0"+s1;

            }

            for(int i=0;i<s1.length();i++){

                if(s1.charAt(i)!=s2.charAt(i))
                ans++;

            }

        }

        return ans;
        
    }

    String toBinary(int n){

        StringBuffer ans=new StringBuffer();

        while(n>0){

            ans.append(n%2);
            n/=2;

        }

        return ans.reverse().toString();

    }
}