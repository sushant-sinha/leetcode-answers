class Solution {
    public int getLucky(String s, int k) {
        
        char ar[]=s.toCharArray();
        
        StringBuilder sb=new StringBuilder();
        
        for(char c:ar){
            sb.append((int)(c-'a')+1);
        }
        
        s=sb.toString();
        
        while(k!=0){
            --k;
            s=trans(s);
        }
        
        return Integer.parseInt(s);
        
    }
    
    String trans(String s){
        
        char ar[]=s.toCharArray();
        int ans=0;
        
        for(char c:ar){
            ans+=Character.getNumericValue(c);
        }
        
        return String.valueOf(ans);
        
    }
}
