// SUSHANT SINHA

// 1ms ( 100% ) 42.3mb ( ~90% )

class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        int ar[]=new int[26];
        
        for(int i=0;i<s.length();i++){
            
            if(ar[s.charAt(i)-'a']==0){
                ar[s.charAt(i)-'a']-=(i+1);
            }
            
            else{
                
                ar[s.charAt(i)-'a']+=i;
                
                //System.out.println(ar[s.charAt(i)-'a']);
                
                if(ar[s.charAt(i)-'a']!=distance[s.charAt(i)-'a']){
                    return false;
                }
                
            }
            
        }
        
        return true;
        
    }
}