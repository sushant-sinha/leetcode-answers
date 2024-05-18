// SUSHANT SINHA

// 2ms ( 97.68% ) 62.83mb ( 33.11% )

class Solution {
    public int maximumEnergy(int[] energy, int k) {

        int[] ans=new int[energy.length];

        int max=Integer.MIN_VALUE;

        for(int i=energy.length-1; i>=0; i--){

            if(i+k<energy.length){
                ans[i]=energy[i]+ans[i+k];
            }

            else{
                ans[i]=energy[i];
            }

            max=ans[i]>max? ans[i] : max;

        }

        return max;
        
    }
}