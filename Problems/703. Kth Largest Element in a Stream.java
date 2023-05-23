// SUSHANT SINHA

// best explanation at https://leetcode.com/problems/kth-largest-element-in-a-stream/discuss/1459107/Java-solution-with-explanation-clean-concise-easy-to-understand-minHeap

// not the expected solution i guess :)
// 535ms ( 6.81% ) 46.6mb ( 70.90% )

class KthLargest {
    int n=0;

    // maintaining an array of length k
    // this array will always have the top k largerst elements.... so the ar[0] will have the kth largest element when sorted in ascending order
    int ar[];
    
    public KthLargest(int k, int[] nums) {
        
        ar=new int[k];
        n=k;
        // filling the array with min value
        // because if the nums.length is less than k then there will be an empty element in ar and it will have value 0 (empty array has all elements initialized as 0)
        // this is to prevent failure in line #35
        Arrays.fill(ar, Integer.MIN_VALUE);
        int index=0;
        
        Arrays.sort(nums);

        while(index<Math.min(nums.length, k)){
            ar[k-index-1]=nums[nums.length-index-1];
            index++;
        }
        
    }
    
    public int add(int val) {
        
        if(val>ar[0]){
            ar[0]=val;
        }

        Arrays.sort(ar);

        return ar[0];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */