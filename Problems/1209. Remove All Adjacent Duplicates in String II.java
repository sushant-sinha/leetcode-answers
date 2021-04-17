// SUSHANT SINHA

class Solution {
    public String removeDuplicates(String s, int k) {
        
        ArrayList<Character> ar=new ArrayList<>();
        
        for(char c:s.toCharArray())
            ar.add(c);
        
        for(int i=0;i<ar.size()-k;i++){
            
            char c=ar.get(i);
            int ck=1;
            
            for(int j=1;j<k;j++){
                if(ar.get(i+j)==c)
                    ck++;
                else break;
            }
            if(ck==k){
                
                for(int j=0;j<k;j++){
                    ar.remove(i);
                }
                i=-1;
            }
            
        }
        
        String ans="";
        
        for(char c:ar)
            ans+=c;
        
        return ans;
        
        
    }
}