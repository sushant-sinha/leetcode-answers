// SUSHANT SINHA

class Solution {
    public int maxArea(int[] height) {
        
        // slow method as the number of iterations are more
        
        // int max=0;
        // for(int i=0;i<(height.length-1);i++){
        //     for(int j=(i+1);j<height.length;j++){
        //         int max1=(height[i]<height[j]) ? height[i] : height[j];
        //         max1*=(j-i);
        //         max=max>max1 ? max : max1;
        //     }
        // }
        // return max;
        
        // fast method
        
        if(height == null || height.length == 0) return 0;

        // Set two pointers at both ends of array
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) 
                      * (right - left));        // update max value
            
            // Move pointers
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}