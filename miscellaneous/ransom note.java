// SUSHANT SINHA

// My solution

class Solution {
    public boolean canConstruct(String r, String m) {
        
        if(r.equals(""))return true;
        
        char r1[]=r.toCharArray();
        char m1[]=m.toCharArray();
        
        boolean flag=true;
        
        for(char x:r1){
        
            flag=true;
            for(int i=0;i<m1.length;i++){
                
                if(x==m1[i]){
                    m1[i]=5;
                    flag=false;
                    break;
                }
                
            }
            
            if(flag)break;
            
        }
            
        return !flag;
    }
}

// Fastest solution

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int alphaCount[] = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, alphaCount[c - 'a']);
            if(index == -1) {
                return false;
            }
            alphaCount[c - 'a'] = index+1;
        }
        return true;
    }
}

// Shortest solution

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()) return false;
        if(ransomNote == null || magazine == null) return false;
        
        int[] temp = new int[26];
        
        for(int i = 0; i < magazine.length(); i++) {
            temp[magazine.charAt(i) - 'a']++;
        }
        
        for(int j = 0; j < ransomNote.length(); j++) {
            
            if(temp[ransomNote.charAt(j) - 'a'] == 0) {
                return false;
            } else {
                temp[ransomNote.charAt(j) - 'a']--;
            }
        }
        
        return true;
    }
}