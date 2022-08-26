class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int ans=0, i=0, curr=0;
        
        for(;i<k;i++){
            
            if(blocks.charAt(i)=='B')
                curr++;
            
        }
        
        if(curr>=k)
            return 0;
        
        else
            ans=k-curr;
        
        //System.out.println("reach");
        
        for(;i<blocks.length();i++){
            
            if(blocks.charAt(i)=='B')
                curr++;
            
            if(blocks.charAt(i-k)=='B')
                curr--;
            
            if(curr>=k)
                return 0;
            
            else
                ans=ans<(k-curr) ? ans : (k-curr);
            
        }
        
        return ans;
        
    }
}

// 0ms solution

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length(),ans,i,cur=0;
        for(i=0;i<k;i++)
        if(blocks.charAt(i)=='W') cur++;
        ans=cur;
        for(i=k;i<n;i++)
        {
            if(blocks.charAt(i)=='W') cur++;
            if(blocks.charAt(i-k)=='W') cur--;
            ans=Math.min(ans,cur);
        }
        return ans;
    }
}