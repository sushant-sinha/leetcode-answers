// SUSHANT SINHA

// 4ms ( 50% ) 38.9mb ( 50% )

class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int ans=0;
        
        for(String s:patterns){

            int len=s.length();
            
            for(int i=0;i<=word.length()-len;i++){

                if(word.substring(i,i+len).equals(s)){
                    ans++;
                    break;
                }

            }
        }
        
        return ans;
    }    
}

// best solution
// 0ms

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (String str: patterns) {
            // indexOf return -4 if there is no occurence is found
            if (word.indexOf(str) >= 0) res++;
        }
        
        return res;
    }
}