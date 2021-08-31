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