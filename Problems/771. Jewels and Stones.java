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

// using 2 char arrays
// 1ms ( 66.19% ) 37.6mb ( 19.28% )

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       char[]ch = jewels.toCharArray();
       char[]c = stones.toCharArray();
        int count=0;
        for(int i=0; i<jewels.length(); i++)
        {
            for(int j =0; j<stones.length(); j++)
            {
                if(ch[i]==c[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}