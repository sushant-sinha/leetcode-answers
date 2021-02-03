// SUSHANT SINHA

// 0ms ( 100% ) 35.2mb( 99.69% )

class Solution {
    public boolean hasAlternatingBits(int n) {
        
        String bin=Integer.toBinaryString(n);
        char ar[]=bin.toCharArray();
        if( ar[0]=='0'){
            for(int i=0;i<ar.length;i++){
                if(i%2==0 && ar[i]=='0')continue;
                if(i%2!=0 && ar[i]=='1')continue;
                else return false;
            }
        }
        
        if( ar[0]=='1'){
            for(int i=0;i<ar.length;i++){
                if(i%2==0 && ar[i]=='1')continue;
                if(i%2!=0 && ar[i]=='0')continue;
                else return false;
            }
        }
        
        return true;
        
    }
}