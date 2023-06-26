// SUSHANT SINHA

// 8ms ( 33.33% ) 43.5mb ( 33.33% )

// string concatenation could be optimized

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        int ans=0;
        
        HashMap<String, Integer> map=new HashMap<>();
        
        for(String s: words){
            
            String rev=""+(s.charAt(1))+(s.charAt(0));
            // System.out.println(rev);
            
            if(map.containsKey(rev) && map.get(rev)==1){
                map.put(rev, 2);
                ans++;
            }
            
            else{
                map.put(s, 1);
            }
            
        }
        
        return ans;
        
    }
}