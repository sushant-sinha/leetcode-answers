// SUSHANT SINHA

// 5ms ( 46.91% ) 43.2mb ( 77.31% )

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        
        HashSet<Integer> seen=new HashSet<>();
        
        for(List<Integer> i: nums){
            
            for(int x=i.get(0); x<=i.get(1); x++)
                seen.add(x);
        }
        
        // System.out.println(seen);
        
        return seen.size();
        
    }
}