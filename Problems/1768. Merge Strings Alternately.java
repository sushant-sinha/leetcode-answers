// SUSHANT SINHA

// using char array
// 0ms ( 100% ) 39.3mb ( 13.82% )

class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char ans[]=new char[word1.length()+word2.length()];
        
        int i=0,j=0,at=0;
        
        char w1[]=word1.toCharArray();
        char w2[]=word2.toCharArray();
        
        while(true){
            if(i==w1.length || j==w2.length )
                break;
            ans[at++]=w1[i++];
            ans[at++]=w2[j++];
            
        }
        
        if(i==word1.length() && j!=word2.length()){
            
            while(j!=w2.length)
                ans[at++]=w2[j++];
            return String.valueOf(ans);
            
        }
        
        if(i!=word1.length() && j==word2.length()){
            
            while(i!=w1.length)
                ans[at++]=w1[i++];
            return String.valueOf(ans);
            
        }
        
        else
            return String.valueOf(ans);
        
    }
}

// using String
// 9ms ( 5.70% ) 40.5mb ( 5.09% )

class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String ans="";
        
        int i=0,j=0;
        
        String w1[]=word1.split("");
        String w2[]=word2.split("");
        
        while(true){
            if(i==w1.length || j==w2.length )
                break;
            ans+=w1[i++];
            ans+=w2[j++];
            
        }
        
        if(i==word1.length() && j!=word2.length()){
            
            while(j!=w2.length)
                ans+=w2[j++];
            return ans;
            
        }
        
        if(i!=word1.length() && j==word2.length()){
            
            while(i!=w1.length)
                ans+=w1[i++];
            return ans;
            
        }
        
        else
            return ans;
        
    }
}