// SUSHANT SINHA

// 16ms ( 33.86% ) 50.9mb ( 24.72% )

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            
            min = arr[i]-arr[i-1] < min ? arr[i]-arr[i-1] : min;
            if(min==0 || min==1)break;
            
        }
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j]-arr[i]==min){
                    
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    break;
                    
                }
                if(arr[j]-arr[i]>min)break;
            }
            if(temp.size()!=0)
            ans.add(temp);
            
        }
        
        return ans;
        
    }
}