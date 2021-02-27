// SUSHANT SINHA

// 1ms ( 99.86% ) 36.5mb ( 98.75% )

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        ArrayList<Integer> ck=new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            int temp=arr[i];
            while(i<arr.length && arr[i]==temp){
                count++;
                i++;
            }
            if(ck.contains(count))return false;
            else ck.add(count);
            --i;
            
        }
        
        return true;
        
    }
}