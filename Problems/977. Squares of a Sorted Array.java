// SUSHANT SINHA

// 1ms ( 100% ) 46.69mb ( 74.63% )

class Solution {
    public int[] sortedSquares(int[] A) {
        
        int arr[]=new int[A.length];

        for(int i=0;i<A.length;i++){
            A[i]*=A[i];
        }

        // using two pointer

        int head=0, tail=A.length-1, index=A.length-1;

        while(head<=tail){

            if(A[head]>A[tail]){
                arr[index]=A[head];
                head++;
            }

            else{
                arr[index]=A[tail];
                tail--;
            }

            index--;

        }

        return arr;
    }
}