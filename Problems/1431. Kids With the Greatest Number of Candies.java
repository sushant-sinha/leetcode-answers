// SUSHANT SINHA

// 0 ms solution

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<Boolean>();
        int max=-1;
        for(int x:candies){
            if(max<x)max=x;
        }
        for(int x:candies){
            if(x+extraCandies>=max)ans.add(true);
            else ans.add(false);
        }
        
        return ans;
    }
}