// SUSHANT SINHA

// 8ms ( 49.68% ) 39.2mb ( 47.57% )

class Solution {
    public int numDifferentIntegers(String word) {
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<word.length();i++){
            
            if(Character.isDigit(word.charAt(i))){
                
                if(word.charAt(i)!='0'){
                    
                    String num=""+word.charAt(i);
                
                    while(++i<word.length() && Character.isDigit(word.charAt(i))){
                        num+=word.charAt(i);
                    }
                
                    if(!ans.contains(num))
                    ans.add(num);
                
                    //System.out.println("1 "+num);
                }
            
                else{
                
                    while(++i<word.length() && Character.isDigit(word.charAt(i)) && word.charAt(i)=='0'){}
                
                    String num="0";
                
                    while(i<word.length() && Character.isDigit(word.charAt(i))){
                        num+=word.charAt(i);
                        i++;
                    }
                
                    if(num.equals("0") && !ans.contains("0")){
                            ans.add("0");
                    }
                    else if(num.length()>1)
                        if(!ans.contains(num.substring(1))){
                            ans.add(num.substring(1));
                        }
                    
                    //System.out.println("2 "+num);
                    
                }
            }
        }
        
//         System.out.println("**********");
        
//         for(String s:ans)
//             System.out.println(s);
        
        return ans.size();
        
    }
}