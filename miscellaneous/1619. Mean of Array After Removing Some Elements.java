// SUSHANT SINHA



// 2 ms(98.99 %)

class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        
        int sum=0,len=0;
        
        for(int i=arr.length/20; i< arr.length-(arr.length/20); i++){
        
            len++;
            sum+=arr[i];
            
        }
        
        return (double)sum/len;
    }
}
