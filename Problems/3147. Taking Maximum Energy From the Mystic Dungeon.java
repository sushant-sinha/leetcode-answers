class Solution {
    public int maximumEnergy(int[] energy, int k) {

        int[] ans=new int[energy.length];

        for(int i=energy.length-1; i>=0; i--){

            if(i+k<energy.length){
                ans[i]=energy[i]+ans[i+k];
            }

            else{
                ans[i]=energy[i];
            }

        }

        Arrays.sort(ans);
        // System.out.println(Arrays.toString(ans));

        return ans[ans.length-1];
        
    }
}