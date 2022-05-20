// SUSHANT SINHA

// 1ms ( 100% ) 39.4mb ( 66.67% )

class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int ans=0;
        
        String s=""+num;
        
        for(int i=0;i<=s.length()-k;i++){
            
            String sub=s.substring(i,i+k);
            
            // System.out.println(sub);
            
            int n=Integer.parseInt(sub);
            
            if(n!=0 && num%n==0)
                ans++;
            
        }
        
        return ans;
        
    }
}