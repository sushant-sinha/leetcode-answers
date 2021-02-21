// SUSHANT SINHA

// my solution
// 261ms ( 5.02% ) 40mb ( 26.10% )

class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int ans=0;
        
        for(int i=0;i<words.length;i++){
            
            if(present(chars,words[i]))
                ans+=words[i].length();
            
        }
        
        return ans;
        
    }
    
    public boolean present( String temp , String x){
        
        ArrayList<String> ch=new ArrayList<>();
        
        for(String a:temp.split(""))
            ch.add(a);
        
        boolean ans=true;
        for(String p:x.split("")){
            
            int flag=0;
            
            for(int i=0;i<ch.size();i++){
                
                if(ch.get(i).equals(p)){
                    ch.remove(i);
                    flag++;
                    break;
                }
                    
            }
            
            if(flag==0)return false;
            
        }
        
        return ans;
    }
}