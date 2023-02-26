// SUSHANT SINHA

// 9ms ( 33.33% ) 39.7mb ( 16.67% )

class Solution {
    public int minMaxDifference(int num) {
        
        return helper(num, '9')-helper(num, '0');
        
    }
    
    int helper(int num, char y){
        
        char ar[]=String.valueOf(num).toCharArray();
        
        char x=ar[0];
        
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=y){
                x=ar[i];
                break;
            }
        }
        
        String ans="";
        
        for(char c:ar){
            
            if(c==x)
                ans+=y;
            
            else
                ans+=c;
        }
        
        return Integer.parseInt(ans);
        
    }
}