// SUSHANT SINHA

// 5ms ( 97.85% ) 39.5mb ( 87.43% )

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        boolean all[]=new boolean[26];
        
        for(char x:allowed.toCharArray())
            all[x-'a']=true;
        
        int ans=0;
        
        for(int i=0;i<words.length;i++){
            boolean ck=true;
            for(char x:words[i].toCharArray())
                if(!all[x-'a']){
                    ck=false;
                    break;
                }
            
            if(ck)
                ans++;
            
        }
        
        return ans;
        
    }
}

// 28ms ( 16.18% ) 39.4mb ( 94.18% )

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        ArrayList<Character> all=new ArrayList<>();
        
        for(char x:allowed.toCharArray())
            all.add(x);
        
        int ans=0;
        
        for(int i=0;i<words.length;i++){
            int ck=0;
            for(char x:words[i].toCharArray())
                if(!all.contains(x)){
                    ck++;
                    break;
                }
            
            if(ck==0)
                ans++;
            
        }
        
        return ans;
        
    }
}