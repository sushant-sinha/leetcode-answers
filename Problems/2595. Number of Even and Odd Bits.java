class Solution {
    public int[] evenOddBit(int n) {
        
        String temp=toBinary(n);
        
        // System.out.println(temp);
        
        int even=0, odd=0;
        
        int len=temp.length();
        
        for(int i=len; i>=1 ;i--){
            
            int index=len-i;
                
            if(index%2==0 && temp.charAt(i-1)=='1'){
                even++;
                continue;
            }
            
            else if(temp.charAt(i-1)=='1')
                odd++;
        }
        
        return new int[]{even, odd};
        
    }
    
    String toBinary(int n){
        
        String temp="";
        
        while(n!=1){
            temp=(n%2)+temp;
            n/=2;
        }
        
        temp="1"+temp;
        
        return temp;
        
    }
}