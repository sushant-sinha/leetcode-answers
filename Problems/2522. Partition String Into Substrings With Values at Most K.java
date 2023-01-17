// SUSHANT SINHA

// 92ms ( 24.42% ) 42.7mb ( 72.78% )

class Solution {
    public int minimumPartition(String s, int k) {
        
        int ans=0;
        
        for(int i=0;i<s.length();){
            
            StringBuffer sb=new StringBuffer();
            
            sb.append(s.charAt(i));
            
            if(k<Integer.valueOf(sb.toString()))
                return -1;
            
            ++i;
            
            while(i<s.length() && Integer.valueOf(sb.toString())<99999999){
                
                sb.append(s.charAt(i));
                
                if(k<Integer.valueOf(sb.toString())){
                    break;
                }
                
                i++;
                
            }
            
            // System.out.println(sb);
            ans++;
            
        }
        
        return ans;
        
    }
}