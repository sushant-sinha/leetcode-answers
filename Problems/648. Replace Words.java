// reference

class Solution {

    public String replaceWords(List<String> dictionary, String sentence) {
        
        HashSet<String>a=new HashSet<>();
        
        for(String s:dictionary)
            a.add(s);
        
        String c="",s="",k="";
        
        for(int i=0;i<sentence.length();i++){
            
            char ch=sentence.charAt(i);
            if(ch==' '){
                s+=c+" ";
                c="";
                k="";
            }
            
            else if(k!="")
                continue;
            
            else{
                c+=ch;
                
                if(a.contains(c))
                 k=c;
            }
        }
        
        return s+c;
        
    }
}