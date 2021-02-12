// SUSHANT SINHA

// 3ms ( 65.26% ) 39.1mb ( 36.38% )

class Solution {
    public String toGoatLatin(String s) {
        
        ArrayList<String> vow=new ArrayList<>();
        
        vow.add("u");vow.add("o");vow.add("i");vow.add("e");vow.add("a");
        
        String ar[] =s.split(" ");
        
        for(int i=0;i<ar.length;i++){
            
            String test=ar[i].substring(0,1).toLowerCase();
            
            if(vow.contains(test)){
                ar[i]+="ma";
                int j=0;
                while(j<(i+1)){
                    ar[i]+="a";
                    ++j;
                }
            }
            
            else{
                
                ar[i]=ar[i].substring(1,ar[i].length())+ar[i].substring(0,1);
                ar[i]+="ma";
                int j=0;
                while(j<(i+1)){
                    ar[i]+="a";
                    ++j;
                }
                
            }
                        
        }
        
        
        return String.join(" ",ar);
        
    }
}

// best solution 

// 1ms ( 99.66% ) 37.7mb ( 66.14% )

class Solution {
    public String toGoatLatin(String S) {
        
        String[] arr = S.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(res.length() > 0)
                res.append(" ");
            res.append(modifyString(arr[i], i));
        }
        
        return res.toString();
    }
    
    String modifyString(String s, int index){
        
        StringBuilder sb = new StringBuilder();
        if(s.charAt(0) != 'a' && s.charAt(0) != 'e' && s.charAt(0) != 'i'
            && s.charAt(0) != 'o' && s.charAt(0) != 'u' &&
            s.charAt(0) != 'A' && s.charAt(0) != 'E' && s.charAt(0) != 'I'
            && s.charAt(0) != 'O' && s.charAt(0) != 'U'){
            
            char ch = s.charAt(0);
            sb.append(s.substring(1)).append(ch);
        }else
            sb.append(s);
        
        sb.append("ma");
        
        for(int i = 0; i <= index; i++)
            sb.append('a');
        
        return sb.toString();
    }
}