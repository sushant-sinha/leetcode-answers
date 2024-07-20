class Solution {
    public int minimumLength(String s) {

        int[] freq = new int[26];

        for(char c: s.toCharArray())
            freq[c-'a']++;


        int ans=0;

        for(int i: freq){

            ans+=remainder(i);

        }

        return ans;
        
    }

    int remainder(int i){

        while(i>=3)
            i-=2;

        return i;
    }
}