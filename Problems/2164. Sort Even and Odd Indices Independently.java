// SUSHANT SINHA

// basic implementation ( used arraylist )
// 5ms ( 66.67% ) 42.3mb ( 33.33% )

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        int index=0;
        
        // for indices
        for(int i=1;i<nums.length;i++){
            
            temp.add(nums[i]);
            i++;
            
        }
        
        Collections.sort(temp, Collections.reverseOrder());
        
        for(int i=1;i<nums.length;i++){
            
            nums[i]=temp.get(index++);
            i++;
            
        }
        
        temp.clear();
        
        // for even indices
        
        index=0;
        
        for(int i=0;i<nums.length;i++){
            
            temp.add(nums[i]);
            i++;
            
        }
        
        Collections.sort(temp);
        
        for(int i=0;i<nums.length;i++){
            
            nums[i]=temp.get(index++);
            i++;
            
        }
        
        return nums;
        
    }
}