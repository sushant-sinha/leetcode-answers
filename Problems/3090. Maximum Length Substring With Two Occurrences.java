class Solution {
    public int maximumLengthSubstring(String s) {

        if(s.length()<3)
            return s.length();

        int freq[]=new int[26];

        // end is inclusive
        int ans=0, start=0, end=1, maxFreq=0;

        freq[s.charAt(start)-'a']++;
        freq[s.charAt(end)-'a']++;

        maxFreq=Math.max(freq[s.charAt(start)-'a'], freq[s.charAt(end)-'a']);

        end++;

        while(start<end && end<s.length()){

            freq[s.charAt(end)-'a']++;

            maxFreq=Math.max(maxFreq, freq[s.charAt(end)-'a']);

            if(maxFreq>2){
                // start removing elements from the back

                for(;start<end;start++){
                    if(s.charAt(start)==s.charAt(end)){
                        freq[s.charAt(start)-'a']--;
                        start++;
                        break;
                    }

                    freq[s.charAt(start)-'a']--;

                }
                maxFreq=2;
            }

            ans=Math.max(ans, end-start+1);
            // System.out.println("start="+start+" end="+end+" "+Arrays.toString(freq));

            end++;

        }

        return ans;
        
    }
}