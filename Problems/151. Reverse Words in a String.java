// SUSHANT SINHA

// 11ms ( 15.89% ) 39.1mb ( 62.16% )

class Solution {
    public String reverseWords(String s) {
        
        ArrayList<String> str=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==' ')
                continue;
            
            else{
                String temp="";
                
                while(i<s.length() && s.charAt(i)!=' '){
                    temp+=s.charAt(i);
                    i++;
                }
                
                str.add(temp);                
            }
            
        }
        
        StringBuffer ans=new StringBuffer();
        
        for(int i=str.size()-1;i>=0;i--){
            ans.append(str.get(i)+" ");
        }
        
        return ans.substring(0,ans.length()-1);
        
    }
}
