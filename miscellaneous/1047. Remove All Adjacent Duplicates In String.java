// SUSHANT SINHA

// my solution using string
// 817ms 46.8mb

class Solution {
    public String removeDuplicates(String S) {
        
        ArrayList<String> ar=new ArrayList<>();
        
        for(String x:S.split(""))
            ar.add(x);
        
        for(int i=0;i<ar.size()-1;i++){
            
            if(ar.get(i).equals(ar.get(i+1))){
                
                ar.remove(i);
                ar.remove(i);
                i=-1;
                
            }
            
        }
        
        String ans="";
        
        for(int i=0;i<ar.size();i++)ans+=ar.get(i);
        
        return ans;
        
    }
}

// using char
// 302ms ( 7.07% ) 40.6mb ( 27.90% )

class Solution {
    public String removeDuplicates(String S) {
        
        ArrayList<Character> ar=new ArrayList<>();
        
        for(char x:S.toCharArray())
            ar.add(x);
        
        for(int i=0;i<ar.size()-1;i++){
            
            if(ar.get(i)==ar.get(i+1)){
                
                ar.remove(i);
                ar.remove(i);
                i=-1;
                
            }
            
        }
        
        String ans="";
        
        for(int i=0;i<ar.size();i++)ans+=ar.get(i);
        
        return ans;
        
    }
}

// gievn solution
// 3ms ( 99.72% ) 39.4mb ( 74.65% )

class Solution {
    public String removeDuplicates(String S) {
        char[] in = S.toCharArray();
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            in[j] = in[i];
            
            
            if (j != 0 && in[j] == in[j - 1]) {
                j = j - 1;
            } else {
                j++;
            }
        }
        
        return new String(in, 0, j);
    }
}