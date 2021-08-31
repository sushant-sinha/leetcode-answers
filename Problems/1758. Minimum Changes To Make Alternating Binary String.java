// SUSHANT SINHA

// 11ms ( 6.55% ) 40.2mb ( 6.86% )
// separate values for the cases

class Solution {
    public int minOperations(String s) {
        
        int ans1=0,ans2=0,i=0;
        
        for(;i<s.length()-1;i+=2){
            
            if(s.charAt(i)!='0')
                ans1++;
            if(s.charAt(i+1)!='1')
                ans1++;
            
            if(s.charAt(i)!='1')
                ans2++;
            if(s.charAt(i+1)!='0')
                ans2++;
            
        }
        
        if(s.length()%2!=0){
            
            ans1+= s.charAt(i)=='1' ? 1 : 0;
            ans2+= s.charAt(i)=='0' ? 1 : 0;
            
        }
                        
        return Math.min(ans1,ans2);
        
    }
}

// 3ms ( 61.59% ) 38.7mb ( 84.76% )
// if ans is more than 50% length of string, it means other answer -> s.length()-ans is smaller than ans

class Solution {
    public int minOperations(String s) {
        
        int ans=0,i=0;
        
        for(;i<s.length()-1;i+=2){
            
            if(s.charAt(i)!='0')
                ans++;
            if(s.charAt(i+1)!='1')
                ans++;            
        }
        
        if(s.length()%2!=0)
            ans+= s.charAt(i)=='1' ? 1 : 0;
        
        return ans>s.length()/2 ? s.length()-ans : ans;
        
    }
}