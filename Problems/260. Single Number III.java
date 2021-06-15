// SUSHANT SINHA

// 268ms ( 5.62% ) 39.5mb ( 41.40% )

// solution using arraylist
// for removing element from arraylist on the basis of value https://www.geeksforgeeks.org/remove-element-arraylist-java/

class Solution {
    public int[] singleNumber(int[] nums) {
         
        int ans[]= new int[2];
        
        ArrayList<Integer> appear = new ArrayList<>();
        
        for(int i:nums){
            if(appear.contains(i))
                appear.remove(new Integer(i));
            else
                appear.add(i);
        }

        ans[0]=appear.get(0);
        ans[1]=appear.get(1);

        return ans;
        
    }
}
