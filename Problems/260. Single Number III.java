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

// 1ms ( 96.95% ) 39.7mb ( 38.21 %)

// from discuss tab
// using bit manipulation

class Solution {
    public int[] singleNumber(int[] nums) {
        
        int[] result = new int[2];
        
        // Step 1: Do XOR of all element
        int xor = 0;
        
        for(int i : nums){
            xor ^= i;
        }
        
        // Step 2: Find Right Most Set Bit in xor
        int rsb = xor & (~(xor-1));
        
        // Step 3: Do AND of rsb with each element
        for(int i : nums){
            
            if((i&rsb) == 0){
                result[0] ^= i;
            }
            else{
                result[1] ^= i;
            }
            
        }
        
        return result;
        
    }
}