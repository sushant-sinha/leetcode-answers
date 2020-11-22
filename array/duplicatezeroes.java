// SUSHANT SINHA
class Solution {
    public void duplicateZeros(int[] arr) {
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(j<arr.length){
            if(arr[i]==0){
                temp[j]=0;
                if(++j<arr.length)
                temp[j]=0;
                else break;
                if(++j>=arr.length) break;
            }
            else{
                temp[j]=arr[i];++j;
            }
            
            }
            else {break;}
        }
        for(int i=0;i<arr.length;i++){
            arr[i]    =temp[i];
        }
        
    }
}