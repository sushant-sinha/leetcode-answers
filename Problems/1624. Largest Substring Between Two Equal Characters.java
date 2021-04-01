// SUSHANT SINHA

// 1ms ( 65.68% ) 36.4mb ( 99.06% )

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        if(s.length()==1)return -1;
        
        char arr[]=s.toCharArray();
        int max=-1;
        
        for(int start=0;start<s.length();start++){
            
            for(int j=s.length()-1;j>start;j--){
                
                if(arr[start]==arr[j]){
                    max = max < j-start-1 ? j-start-1 : max;
                }
                
            }
            
        }
        
        return max;
        
    }
}

// 0ms ( 100% )

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        int[] starting = new int[26];
        for(int i=0; i<26; ++i) {
            starting[i] = -1;
        }
        for(int i=0; i<s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            if(starting[idx] == -1) {
                starting[idx] = i;
            } else {
                max = Math.max(max, i-starting[idx]-1);
            }
        }
        return max;
    }
}