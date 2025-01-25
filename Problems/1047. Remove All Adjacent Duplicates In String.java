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

/*
given solution
3ms ( 99.72% ) 39.4mb ( 74.65% )

two pointer, end holds the end of the new string while i scans the string
replace the end with the current i
if at any point, end is same as i, we will move back the end (because we are removing the last character)
*/

class Solution {
    public String removeDuplicates(String s) {

        char[] ar=s.toCharArray();

        int end=1;

        for(int i=1;i<s.length();i++){

            // replace the end with the current character (i)

            ar[end]=ar[i];

            // check if the two match (charat end and charat end-1)
            if(end!=0 && ar[end]==ar[end-1])
                end--;
            else
                end++;

            // System.out.println(ar);
        }

        return new String(ar, 0, end);
        
    }
}