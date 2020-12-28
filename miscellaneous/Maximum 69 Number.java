// SUSHANT SINHA

// My solution 6ms 36.2mb

class Solution {
    public int maximum69Number (int num) {
        
        StringBuffer sb=new StringBuffer(""+num);
        
        for(int i=0;i<sb.length();i++){
            
            if(sb.charAt(i)!='9')
            {
                sb.replace(i,i+1,"9");
                break;
            }
            
        }
        
        System.out.println(sb);
        
        return Integer.valueOf(sb.toString());
        
    }
}

// Almost similar but fast 0ms

class Solution {
    public int maximum69Number (int num) {
        
        String s = Integer.toString(num);
        char ch[] = s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
            if(ch[i] == '6')
            {
                ch[i] = '9';
                break;
            }
        }
        
        String k = new String(ch);
        
        int ans = Integer.parseInt(k);
        
        return ans;
        
    }
}