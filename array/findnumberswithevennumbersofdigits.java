// SUSHANT SINHA
class Solution {
    public int findNumbers(int[] nums) {
        int length,temp,ans=0;
        for(int i=0;i<nums.length;i++){
            length=0;
            temp=nums[i];
            while((temp/10)!=0){
                length++;
                temp=temp/10;
            }
            if(length%2==0)ans++;
        }
        return (nums.length-ans);
    }
}