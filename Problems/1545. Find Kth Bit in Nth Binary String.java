class Solution {

    int bitFlip=0;

    public char findKthBit(int n, int k) {

        int lengthOfString=(int)Math.pow(2,n)-1;

        int x=recur(n, k, lengthOfString);

        // System.out.println(x+ " "+bitFlip);

        while(bitFlip!=0){
            x = x==0 ? 1 : 0;
            bitFlip--;
        }

        

        return (char)(x+'0');

    }

    int recur(int n, int k, int len){

        // System.out.println("in for n="+n+ " "+k);

        if(n==1)
            return 0;

        if(k==len/2+1)
            return 1;

        // first half
        else if(k<=len/2){
            return recur(n-1, k, len/2);
        }

        else{
            bitFlip++;
            return recur(n-1, len/2-(k-len/2-1)+1, len/2);
        }
    }
}