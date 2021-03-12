// SUSHANT SINHA

// 11ms ( 22.42 ) 40mb ( 21.75% )

class Solution {
    public String reformat(String s) {
        
        ArrayList<String> num=new ArrayList<>();
        ArrayList<String> str=new ArrayList<>();
        
        String ans="";
        
        for(char x:s.toCharArray()){
            
            if(Character.isDigit(x))
                num.add(""+x);
            else
                str.add(""+x);
            
        }
        
        if(num.size()-str.size()==1){
            
            for(int i=0;i<str.size();i++){
                ans+=num.get(i);
                ans+=str.get(i);
            }
            ans+=num.get(num.size()-1);
            
        }
        
        else if(str.size()-num.size()==1){
            
            for(int i=0;i<num.size();i++){
                ans+=str.get(i);
                ans+=num.get(i);
            }
            ans+=str.get(str.size()-1);
            
        }
        
        else if(num.size()==str.size()){
            
            for(int i=0;i<num.size();i++){
                ans+=str.get(i);
                ans+=num.get(i);
            }
            
        }
        
        else return "";
        
        return ans;
        
    }
}