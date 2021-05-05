// SUSHANT SINHA

class Solution {
    public int numTeams(int[] arr) {
        
        int small=0,large=0,ans=0;

        for(int i=1; i<arr.length-1; i++){
            small=0; large=0;
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j])
                    small++;
            }
            for(int k=i+1; k<arr.length; k++){
                if(arr[i] < arr[k])
                    large++;
            }
            
            ans += (small*large)+((i-small)*(arr.length-i-1-large));
        }
        
        return ans;
    }
}