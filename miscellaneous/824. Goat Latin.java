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