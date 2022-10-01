class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> ans=new ArrayList<>();
        
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            
            if(Math.abs((arr[index]-x))>Math.abs((arr[i]-x)))
                index=i;
            
        }
        
        //System.out.println(index);
        
        int left=index-1, right=index+1;
        
        ans.add(arr[index]);
        k--;
        while(k!=0){
            //System.out.println(ans+" "+left+" "+right);
            if(right<arr.length && left>=0 && Math.abs(x-arr[left])>Math.abs(x-arr[right]) ){
                ans.add(arr[right]);
                right++;
            }
            
            else if(right<arr.length && left>=0 && Math.abs(x-arr[left])<=Math.abs(x-arr[right])){
                ans.add(arr[left]);
                left--;
            }
            
            else if(right>=arr.length && left>=0){
                ans.add(arr[left]);
                left--;
            }
            
            else{
                ans.add(arr[right]);
                right++;
            }
            
            
            
            k--;
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}