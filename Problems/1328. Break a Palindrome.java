// SUSHANT SINHA

// 6ms ( 12.97% ) 42.6mb ( 7.81% )

class Solution {
    public String breakPalindrome(String palindrome) {
        
        if(palindrome.length()==1)
            return "";
        
        StringBuffer sb=new StringBuffer();
        
        boolean flag=false;
        
        for(int i=0;i<palindrome.length()/2;i++){
            
            if(palindrome.charAt(i)!='a' && !flag){
                //System.out.println(i+" "+palindrome.substring(0,i)+"a"+palindrome.substring(i+1,palindrome.length()));
                flag=true;
                sb.append(palindrome.substring(0,i)+"a"+palindrome.substring(i+1,palindrome.length()));
                break;
            }
            
        }
        
        //System.out.println(sb);
        
        if(!flag){
            
            sb=new StringBuffer();
            
            for(int i=palindrome.length()-1; i>=palindrome.length()/2; i--){
                
                if(palindrome.charAt(i)=='a'){
                    sb.append(palindrome.substring(0,i)+"b"+palindrome.substring(i+1,palindrome.length()));
                    break;
                }
            }
            
        }
        
        return sb.toString();
        
    }
}