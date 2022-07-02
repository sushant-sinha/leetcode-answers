// SUSHANT SINHA

// my solution (one condition is reduntant-> the if and else condition i guess))
// 26ms ( 16.41% ) 61.7mb ( 6.75% )

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long hMaxDiff=horizontalCuts[0], vMaxDiff=verticalCuts[0];
        
            
        for(int i=0;i<horizontalCuts.length-1;i++){
            
            hMaxDiff=hMaxDiff>horizontalCuts[i+1]-horizontalCuts[i] ? hMaxDiff : horizontalCuts[i+1]-horizontalCuts[i];
            
        
        
        hMaxDiff= hMaxDiff> h-horizontalCuts[horizontalCuts.length-1] ? hMaxDiff : h-horizontalCuts[horizontalCuts.length-1];
        
    
    
    
        hMaxDiff= hMaxDiff>h-horizontalCuts[0] ? hMaxDiff : h-horizontalCuts[0];
    
        
        for(int i=0;i<verticalCuts.length-1;i++){
            
            vMaxDiff=vMaxDiff>verticalCuts[i+1]-verticalCuts[i] ? vMaxDiff : verticalCuts[i+1]-verticalCuts[i];
            
        }
        
        vMaxDiff= vMaxDiff>w-verticalCuts[verticalCuts.length-1] ? vMaxDiff : w-verticalCuts[verticalCuts.length-1];
        
        vMaxDiff= vMaxDiff>w-verticalCuts[0] ? vMaxDiff : w-verticalCuts[0];
        
        
        // System.out.println(hMaxDiff+" "+vMaxDiff);

        // if have used long instead of int ... this would have worked
        // int ans=1;
        // ans=(ans*hMaxDiff)%1000000007;
        // ans=(ans*vMaxDiff)%1000000007;
        
        // return ans;
        
        
        long ans=((hMaxDiff%1000000007)*(vMaxDiff%1000000007))%(1000000007);
        return (int)ans;
        
    }
}