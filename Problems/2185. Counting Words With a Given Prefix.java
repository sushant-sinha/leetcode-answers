// SUSHANT SINHA

// 5ms ( 16.67% ) 42.9mb ( 83.33% )

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int ans=0, len=pref.length();
        
        boolean flag=false;
        
        for(String s:words){
            
            flag=true;
            
            if(s.length()<len)
                continue;
            
            for(int i=0;i<len;i++){
                if(s.charAt(i)!=pref.charAt(i)){
                    flag=false;
                    break;
                }
            }
            
            if(flag)
                ans++;
            
        }
        
        return ans;
        
    }
}


// when initializing the flag variable in every iteration
// 3ms ( 16.67% ) 43.5mb ( 50.00% )

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int ans=0, len=pref.length();
        
        // removed the flag variable and is being initialzed in the for loop every iteration
        // initializing the flag variable every time in the for loop itself gives better speed

        for(String s:words){
            
            boolean flag=true;
            
            if(s.length()<len)
                continue;
            
            for(int i=0;i<len;i++){
                if(s.charAt(i)!=pref.charAt(i)){
                    flag=false;
                    break;
                }
            }
            
            if(flag)
                ans++;
            
        }
        
        return ans;
        
    }
}


// best solution from the submission section
// 0ms

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int result = 0;
        String word;
        
        for (int i = 0; i < words.length; ++i){
            word = words[i];
            
            if (word.startsWith(pref)) ++result;
        }
        
        return result;
    }
}