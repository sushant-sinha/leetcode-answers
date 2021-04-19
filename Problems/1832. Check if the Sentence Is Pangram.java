// SUSHANT SINHA

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] exist= new boolean[26];
        
        for(char c:sentence.toCharArray())
            exist[c-'a']=true;
        
        return all(exist);
        
    }
    
    boolean all(boolean ar[]){
        
        for(boolean c:ar)
            if(c==false)
                return false;
        
        return true;
        
    }
}


// using int
// 1ms ( 100% ) 38.1mb ( 25.00% )

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] exist= new int[26];
        
        for(char c:sentence.toCharArray())
            exist[c-'a']++;
        
        return all(exist);
        
    }
    
    boolean all(int ar[]){
        
        for(int c:ar)
            if(c==0)
                return false;
        
        return true;
        
    }
}