// SUSHANT SINHA

// 1ms ( 66.67% ) 38.6mb ( 16.67% )

class Solution {
    public boolean checkZeroOnes(String s) {
        
        int zero=counter(s,"1");
        int one=counter(s,"0");
        
        return one>zero;
    }
    
    public int counter(String s, String c){
        
        int count=0;
        
        String sp[]=s.split(c);
        
        for(String x:sp)
            count = count > x.length() ? count : x.length();
        
        return count;
        
    }
    
}