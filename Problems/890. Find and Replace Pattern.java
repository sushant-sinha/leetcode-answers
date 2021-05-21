// SUSHANT SINHA

// used char array to map the words between pattern and the given word.
// 3ms ( 11.32% ) 37.5mb ( 99.89% )

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans= new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            
            char ar[]= new char[26];
            // initializing char array with a charater that will be never used
            for(int x=0;x<26;x++)
                ar[x]='$';
            boolean flag=true;
            
            for(int j=0;j<pattern.length();j++){
                
                if(ar[pattern.charAt(j)-'a']=='$'){
                    
                    boolean check=false;
                    
                    for(char c:ar){
                        if(c==words[i].charAt(j)){
                            check=true;
                            break;
                        }
                    }
                    
                    if(check){
                        flag=false;
                        break;
                    }
                    
                    ar[pattern.charAt(j)-'a']=words[i].charAt(j);
                    
                }
                else if(ar[pattern.charAt(j)-'a']!=words[i].charAt(j)){
                    flag=false;
                    break;
                }
                else
                    continue;
                
            }
            
            if(flag){
                ans.add(words[i]);
            }
            
        }
        
        return ans;
        
    }
}