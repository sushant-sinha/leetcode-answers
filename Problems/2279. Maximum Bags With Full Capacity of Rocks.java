// SUSHANT SINHA

// 18ms ( 89.91% ) 90.2mb ( 60.65% )

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int diff[]=new int[rocks.length];
        
        for(int i=0;i<rocks.length;i++)
            diff[i]=capacity[i]-rocks[i];
        
        Arrays.sort(diff);
        
        for(int i=0;i<diff.length;i++){
            
            if(additionalRocks==0)
                break;
            
            if(diff[i]<=additionalRocks){
                additionalRocks-=diff[i];
                diff[i]=0;
            }
            
        }
        
        int i=0;
        
        while(i<capacity.length && diff[i]==0)
            i++;
        
        return i;
        
    }
}