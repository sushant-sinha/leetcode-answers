// SUSHANT SINHA

// best dolution from the submission section
// 16ms ( 98.49% ) 62mb ( 5.47% )

class Solution {
    
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        
        return (int)((getMax(h,hc)*getMax(w,vc))%1000000007);
        
    }
    
    public long getMax(int len,int[] cuts){
        
        Arrays.sort(cuts);
        
        // using the long data type is very important because the input cannot be accomodated in the int data type sometimes
        // from variable is for storing the previous value... to get the difference between the present value and the previous value
        long from=0,max=0;
        
        for(int c:cuts){
            
            max=Math.max(max,c-from);
            from=c;
        }
        
        return Math.max(max,len-from);
    }
}


// 26ms ( 16.41% ) 61.7mb ( 6.75% )

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long hMaxDiff=horizontalCuts[0], vMaxDiff=verticalCuts[0];
        
        if(horizontalCuts.length>1){
            
            for(int i=0;i<horizontalCuts.length-1;i++){
                
                hMaxDiff=hMaxDiff>horizontalCuts[i+1]-horizontalCuts[i] ? hMaxDiff : horizontalCuts[i+1]-horizontalCuts[i];
                
            }
            
            hMaxDiff= hMaxDiff> h-horizontalCuts[horizontalCuts.length-1] ? hMaxDiff : h-horizontalCuts[horizontalCuts.length-1];
            
        }
        
        else
            hMaxDiff= hMaxDiff>h-horizontalCuts[0] ? hMaxDiff : h-horizontalCuts[0];
        
        
        if(verticalCuts.length>1){
            
            for(int i=0;i<verticalCuts.length-1;i++){
                
                vMaxDiff=vMaxDiff>verticalCuts[i+1]-verticalCuts[i] ? vMaxDiff : verticalCuts[i+1]-verticalCuts[i];
                
            }
            
            vMaxDiff= vMaxDiff>w-verticalCuts[verticalCuts.length-1] ? vMaxDiff : w-verticalCuts[verticalCuts.length-1];
            
        }
        
        else
            vMaxDiff= vMaxDiff>w-verticalCuts[0] ? vMaxDiff : w-verticalCuts[0];
        
        
        //System.out.println(hMaxDiff+" "+vMaxDiff);

//         if have used long instead of int ... this would have worked
//         int ans=1;
//         ans=(ans*hMaxDiff)%1000000007;
//         ans=(ans*vMaxDiff)%1000000007;
        
//         return ans;
        
        
        long ans=((hMaxDiff%1000000007)*(vMaxDiff%1000000007))%(1000000007);
        return (int)ans;
        
    }
}