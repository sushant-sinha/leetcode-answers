// SUSHANT SINHA

class Solution {
    public void sortColors(int[] nums) {
        
        int arr[]=new int[3];
        for(int x:nums){
            if(x==0)arr[0]++;
            else if(x==1)arr[1]++;
            else arr[2]++;
        }
        
        int i=0;
        for(;i<arr[0];i++)nums[i]=0;
        for(int x=0;x<arr[1];i++){nums[i]=1;x++;}
        for(int x=0;x<arr[2];i++){nums[i]=2;x++;}
    }
}