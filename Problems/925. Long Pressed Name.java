// SUSHANT SINHA

// has loop issues

/*

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        char s1[]=name.toCharArray();
        char s2[]=typed.toCharArray();
        
        if(s2.length<s1.length)
            return false;
        
        int i=0,j=0;
        boolean end=false;
        
        for(;i<s1.length;i++){
            
            if(s1[i]!=s2[j])
                return false;
            
            if(s1[i]==s2[j]){
                while(i>0 && s1[i-1]==s2[j]){
                    j++;
                    if(j==s2.length){
                        end=true;
                        break;
                    }
                }
            }
            
            if(end)
                break;
            
        }
        
        return true;
        
    }
}

*/

// from discuss tab
// 0ms ( 100% ) 36.9mb ( 78.20% )

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length())
            return false; // base check
        
        int i = 0;
        int j = 0;
        //int itr=0; to see what happens in each iteration
        
        while(i<name.length()||j<typed.length()){
            //System.out.println(++itr);
            
            if(j==typed.length())
                return false; // typed completely dealt with but a part of name string is still left , return false
            
            else if(i<name.length()&&name.charAt(i)==typed.charAt(j)){
                // System.out.println("basic "+name.charAt(i)+" "+typed.charAt(j));
                i++; 
                j++;
                
                // increment both we will deal with long press later 
            }
            
            else{
                
                if(i>0&&name.charAt(i-1)==typed.charAt(j)){ // dealing with long press
                    // System.out.println("long press "+name.charAt(i-1)+" "+typed.charAt(j)+" "+j);
                    j++;
                    
                }
                else return false; // no long press , return false
            }
        }
        
        if(i==name.length()&&j==typed.length()) 
            return true; // entirely processed both strings so return true
        
        return false;
    }
}