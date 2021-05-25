// SUSHANT SINHA

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