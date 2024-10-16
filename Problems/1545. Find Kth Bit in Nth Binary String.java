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

        if(n==1)
            return 0;

        if(k==len/2+1)
            return 1;

        // if index falls in the first half
        else if(k<=len/2){
            return recur(n-1, k, len/2);
        }

        // if it falls in the second half
        else{
        	// handle inverse
            bitFlip++;

            // since its reversed, the new index in the second half (from front) will be len/2 - a + 1 (a is the index from front)
            // index from front will be k-len/2-1 (remove half string from front, and 1 that we appended)

            return recur(n-1, len/2-(k-len/2-1)+1, len/2);
        }
    }
}