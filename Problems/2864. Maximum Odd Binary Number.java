// SUSHANT SINHA

// 1ms ( 100% ) 43.4mb ( 56.64% )

class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int count1=0;
        
        for(char c:s.toCharArray())
            if(c=='1')
                count1++;
        
        int count0=s.length()-count1;
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<count1-1;i++){
            ans.append('1');
        }
        for(int i=0;i<count0;i++){
            ans.append('0');
        }
        
        ans.append('1');
        
        return ans.toString();
        
    }
}