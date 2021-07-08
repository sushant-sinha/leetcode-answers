// SUSHANT SINHA

// 0ms ( 100% ) 38.6mb ( 16.64% )

class Solution {
    public String reverseOnlyLetters(String s) {
        
        char ar[]=s.toCharArray();
        char ans[]=s.toCharArray();
        
        int x=ar.length;
                
        for(int i=0;i<ans.length;i++){
            if(Character.isLetter(ans[i])){
                
                x=findnext(ar,x);
                ans[i]=ar[x];
                
            }
        }
        
        return String.valueOf(ans);
        
    }
    
    int findnext(char ar[], int i){
        
        i--;
        
        while(i>=0){
            if(Character.isLetter(ar[i])){
                return i;
            }
            i--;
        }
        
        
        return -1;
    }
}