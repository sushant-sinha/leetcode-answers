class Solution {
    public int findTheLongestSubstring(String s) {

        // sliding window should do just fine

        int ans=-1;

        HashMap<Character, Integer> charAndBit=new HashMap<>();

        charAndBitput('a', 0);
        charAndBitput('a', 1);
        charAndBitput('a', 2);
        charAndBitput('a', 3);
        charAndBitput('a', 4);


        HashMap<Integer, Integer> firstBitPattern=new HashMap<>();
        firstBitPattern.put(0,0);

        int head=0, bitMask=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                bitMask=bitMask^(1<<charAndBit.get(s.charAt(i)));
            }

            if(firstBitPattern.containsKey(bitMask)){
                ans=Math.max(ans, i-firstBitPattern(bitMask)+1);
            }

            else{
                firstBitPattern.put(bitMask, i);
            }


        }

        return ans;
        
    }
}