// SUSHANT SINHA

// 1ms ( 75% ) 37.2mb ( 75% )

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

// best solution

// 0ms ( 100% )

class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            int val = c - 'a' + 1;
            sum += val % 10 + val / 10;
        }
        for (int i = 1; i < k; i++) {
            int newsum = 0;
            while (sum > 0) {
                newsum += sum % 10;
                sum /= 10;
            }
            sum = newsum;
        }
        return sum;
    }
}