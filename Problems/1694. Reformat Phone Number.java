// SUSHANT SINHA

// 1ms ( 99.06% ) 37mb ( 98.11% )

class Solution {
    public String reformatNumber(String number) {
                
        StringBuffer sb=new StringBuffer();        
        StringBuffer ans=new StringBuffer();
        
        for(char c:number.toCharArray()){
            
            if(c!=' ' && c!='-')
                sb.append(c);
            
        }
        
        int len=sb.length();        
        //System.out.println(len);
        
        if(sb.length()<=3)
            return sb.toString();
        
        if(len%3==0){
            
            for(int i=0;i<len;i++){
                ans.append('-').append(sb.charAt(i)).append(sb.charAt(++i)).append(sb.charAt(++i));
            }
            
            return ans.substring(1).toString();
            
        }
        
        if(len%3==2){
            
            for(int i=0;i<len-2;i++){
                ans.append('-').append(sb.charAt(i)).append(sb.charAt(++i)).append(sb.charAt(++i));
            }
            
            return ans.append('-').append(sb.charAt(len-2)).append(sb.charAt(len-1)).substring(1).toString();
            
        }
        
        // this last case was reffered from 
        // https://leetcode.com/problems/reformat-phone-number/discuss/1626513/Java-Fastest-and-Easiest-O(N)-Time-and-O(1)-Space-Solution
        
        else{
            
            // making as many 3 digit sections as possible
            
            for(int i=0; i<len-4; i++){
                ans.append('-').append(sb.charAt(i)).append(sb.charAt(++i)).append(sb.charAt(++i));
            }
                        
            return ans.append('-').append(sb.charAt(len-4)).append(sb.charAt(len-3)).append('-').append(sb.charAt(len-2)).append(sb.charAt(len-1)).substring(1).toString();
            
        }
        
    }
}