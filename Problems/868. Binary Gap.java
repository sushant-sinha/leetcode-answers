// SUSHANT SINHA

// my solution
// 5ms ( 8.12% ) 36.1mb ( 15.34% )

class Solution {
    public int binaryGap(int n) {
        
        StringBuilder sb= new StringBuilder();
        
        while(n!=1){
            sb.append(""+n%2);
            n/=2;
        }
        
        sb.append("1");
        int count1=0;
        for(char c:sb.toString().toCharArray()){
            if(c=='1')
                count1++;
            if(count1>1)
                break;
        }
        if(count1==1)
            return 0;
        int max=0;
        
        for(int i=0;i<sb.length();i++){
            int temp=0;
            if(sb.charAt(i)=='1'){
                ++i;
                while(i<sb.length() && sb.charAt(i)=='0'){
                    temp++;
                    i++;
                }
                temp++;
                --i;
                max=max>temp?max:temp;
                
            }
            
        }
        
        return max;
        
    }
}

// best solution

class Solution {
    public int binaryGap(int n) {
         int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i)
            if (((n >> i) & 1) != 0)
                A[t++] = i;

        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
            ans = Math.max(ans, A[i+1] - A[i]);
        return ans;
    }
}