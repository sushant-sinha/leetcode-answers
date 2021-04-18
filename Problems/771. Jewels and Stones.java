// SUSHANT SINHA

// my solution using ArrayList
// 2ms ( 13.58% ) 39mb ( 5.30% )

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        ArrayList<Character> j=new ArrayList<>();
        
        for(char c:jewels.toCharArray())
            j.add(c);
        
        int ans=0;
        
        for(char c:stones.toCharArray()){
            if(j.contains(c))
                ans++;
        }
        
        return ans;
        
    }
}
