// SUSHANT SINHA

// 29ms ( 23.68% ) 68.6mb ( 6.49% )

// the question expects the solution to run in O(n) time and uses constant extra space.


class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> seen=new HashSet<>();
        
        /*
        Arrays.sort(nums);
        
        boolean end=false, hasone=false;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>0){
                
                if(i==1)
                
            }
        }
        
        return ;
        */
        
        int min=0, max=Integer.MIN_VALUE;
        
        for(int i:nums){
            
            if(i>0){
                
                if(i<min)
                    min=i;
                
                if(i>max)
                    max=i;
                
            }
            
            seen.add(i);
        }
        
        if(min>1 || max<1)
            return 1;
        
        
        for(int i=min+1;i<max;i++){
            
            if(!seen.contains(i)){
                return i;
            }
            
        }
        
        return max+1;
        
    }
}

//expected solition from the submission tab

class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;

        int arr[] = new int[size+1];

        for(int i=0;i<size;i++){
            int temp=nums[i];
            if(temp>0 && temp<=size){
                arr[temp]=temp;
            }
        }
        
        for(int i=1;i<size+1;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return size+1;
    }
}

// best solution
// 1ms

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int[] A = nums;
        int n = A.length;
        for (int i = 0; i < n; i++) {

            if (A[i] > n || A[i] < 1) {
                continue;
            }

            while (A[i] != (i + 1) && A[i] < n && A[i] > 0 && A[i] != A[A[i] - 1]) {
                int temp = A[i];
                A[i] = A[temp - 1];
                A[temp - 1] = temp;
            }
        }

        int ans = 1;

        for (int i = 0; i < A.length; i++) {
            if (ans == A[i]) {
                ans++;
            } else {
                break;
            }
        }

        return ans; 
        
    }
}