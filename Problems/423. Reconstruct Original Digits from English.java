// from indiacoder

// 3ms ( 100% ) 39.1mb ( 99.03% )

class Solution {
    public String originalDigits(String s) {
        int[] map = new int[26];
        for(char c: s.toCharArray()){
            map[c-'a']++;
        }

        int[] digit = new int[10];

        digit[0] = map['z'-'a'];
        digit[6] = map['x'-'a'];
        digit[4] = map['u'-'a'];
        digit[2] = map['w'-'a'];
        digit[8] = map['g'-'a'];
        digit[5] = map['f'-'a']  - digit[4];
        digit[7] = map['s'-'a']  - digit[6];
        digit[1] = map['o'-'a'] - digit[0] - digit[2] - digit[4];
        digit[3] = map['t'-'a'] - digit[8] - digit[2];

        digit[9] = map['i'-'a'] - digit[5] - digit[6] - digit[8];



        StringBuilder ans = new StringBuilder();
        for(int i=0;i<10;i++){
            int freq = digit[i];
            while(freq>0){
                ans.append(i);
                freq--;
            }
        }

        return ans.toString();
        
    }
}