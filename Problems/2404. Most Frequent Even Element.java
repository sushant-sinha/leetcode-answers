// SUSHANT SINHA

// 21ms ( 45.45% ) 54mb ( 36.36% )

// initial approach

class Solution {
    public int mostFrequentEven(int[] nums) {
        
        int ans=-1, n=nums.length, max=0;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            
            int counter=1;
            
            if(nums[i]%2==0){
                
                int temp=nums[i];
                
                i++;
                
                while(i<n && nums[i]%2==0){
                    
                    if(nums[i]!=temp){
                        i--;
                        break;
                    }
                    
                    counter++;
                    i++;
                    
                }
                
                //System.out.println(counter);
                
                ans = counter>max ? temp : ans;
                max=max>counter ? max : counter;
                
            }
            
        }
        
        return ans;
        
    }
}

// best solution
// claimed 6ms runtime

class Solution {
    public int evenMajorityNumber(int[] nums) {
        int [] arr = new int [10_001];
        
        for (int num : nums){
            ++arr[num];
        }
        int max = 0;
        int result = -1;
        
        //System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i += 2){
            //System.out.println(max + " " + arr[i]);
            if (max < arr[i]){
                result = i;
                max = arr[i];
            }
        }
        
        return result;
    }
