// SUSHANT SINHA

// basic approach 😑
// 1234 ms ( 5.03% ) 39.5mb ( 60.92% )

class Solution {
    public String longestWord(String[] words) {
        
        String ans="";
        
        ArrayList<String> ar=new ArrayList<>();
        
        for(String s:words)
            ar.add(s);
        
        // array is faster than arraylist
        
        for(String test:words){
            
            boolean isans=true;
            
            for(int i=1;i<test.length();i++){
                
                if(!ar.contains(test.substring(0,i)))
                    isans=false;
                
            }
            
            if(isans){
                
                if(ans.length()==test.length())
                    ans= ans.compareTo(test)>0 ? test : ans;
                
                else
                    ans=ans.length()<test.length() ? test : ans;
                
                
            }
            
            
        }
        
        return ans;
        
    }
}