// SUSHANT SINHA

// had to refer from the solution section.
// was confused when to move forward the tail
// or when to just keep on going ahead and look for the next vowel to get the even frequency

// 58ms ( 45.55% ) 45.36mb ( 60.50% )

class Solution {
    public int findTheLongestSubstring(String s) {

        // sliding window should do just fine?
        // Nah!! It wont.

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