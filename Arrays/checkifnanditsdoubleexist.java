// SUSHANT SINHA
class Solution {
    public boolean checkIfExist(int[] arr) {
        int temp;
        boolean a=false;
        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            for(int j=(i+1);j<arr.length;j++){
                if((arr[j]*2)==arr[i] || (((arr[j]%2)==0) && (arr[j]/2)==arr[i])) {a=true;break;}
            
            }
            if(a)break;
        }
        return a;
    }
}