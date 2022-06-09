// SUSHANT SINHA

// 37-42ms ( 83.83%-45.75% ) 76.9-69.5mb ( 46.95%-82.04% )

class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        
        Arrays.sort(special);
        
        int ans=0, old=0;
        int i=0;
        
        while(bottom<=top && i<special.length){
            
            int len=special[i]-bottom;
            //System.out.println("bottom"+bottom+" spe "+special[i]+" len "+len+" ans "+ans);
            ans=len>ans ? len : ans;
            
            bottom=special[i]+1;
            i++;
            
        }
        
        ans=(top-bottom+1)>ans ? (top-bottom+1) : ans;
        
        //System.out.println(i);
        
        return ans;
        
    }
}