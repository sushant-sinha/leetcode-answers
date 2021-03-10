// SUSHANT SINHA

class Solution {
    public boolean halvesAreAlike(String s) {
        
        ArrayList<String> vowels= new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
        
        String first=s.substring(0,s.length()/2).toLowerCase();
        String second=s.substring(s.length()/2,s.length()).toLowerCase();
        
        int vow[]=new int[2];
        
        for(int i=0;i<first.length();i++){
            
            if(vowels.contains(first.substring(i,i+1)))vow[0]++;
            if(vowels.contains(second.substring(i,i+1)))vow[1]++;
            
        }
        
        
        
        return vow[0]==vow[1];
    }
}