class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int ans[]=new int[queries.length];
        
        for(int i=0;i<ans.length;i++){
            
            int start=queries[i][0];
            int end=queries[i][1];
            
            ans[i]=arr[start++];
            
            for(;start<=end;start++){
                
                ans[i]^=arr[start];
                
            }
            
        }
        
        return ans;
        
    }
}


class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int ans[]=new int[queries.length];
        
        int preCal[]= new int[arr.length];
        preCal[0]=arr[0];
        
        for(int i=1;i<arr.length;i++){
            preCal[i]=preCal[i-1]^arr[i];
        }
        
        for(int i=0;i<ans.length;i++){
            
            int start=queries[i][0];
            int end=queries[i][1];
            
            ans[i]=preCal[end];
            
            if(start==0){
                
                continue;
            }
            
            start--;
            
            for(;start>=0;start--){
                
                ans[i]^=arr[start];
                
            }
            
        }
        
        return ans;
        
    }
}