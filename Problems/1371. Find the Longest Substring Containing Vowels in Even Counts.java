class Solution {
    public int findTheLongestSubstring(String s) {

        // sliding window should do just fine

        int ans=0;

        HashMap<Character, Integer> charAndBit=new HashMap<>();

        charAndBit.put('a', 0);
        charAndBit.put('e', 1);
        charAndBit.put('i', 2);
        charAndBit.put('o', 3);
        charAndBit.put('u', 4);


        HashMap<Integer, Integer> firstBitPattern=new HashMap<>();
        firstBitPattern.put(0,-1);

        int head=0, bitMask=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                bitMask=bitMask^(1<<charAndBit.get(s.charAt(i)));
            }

            if(firstBitPattern.containsKey(bitMask)){
                ans=Math.max(ans, i-firstBitPattern.get(bitMask));
            }

            else{
                firstBitPattern.put(bitMask, i);
            }

        }

        return ans;
        
    }
}