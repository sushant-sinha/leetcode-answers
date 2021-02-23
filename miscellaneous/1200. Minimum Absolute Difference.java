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
                // to break as the array is sorted and we have passed the possible number with x-y=min
                if(arr[j]-arr[i]>min)break;
            }
            if(temp.size()!=0)
            ans.add(temp);
            
        }
        
        return ans;
        
    }
}

// best solution 10ms

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Used sort
        // Arrays.sort(arr);
        // List<List<Integer>> list = new ArrayList();
        // int delta = Integer.MAX_VALUE;
        // for(int i =1; i< arr.length; i++){
        //     int t = arr[i] - arr[i-1];
        //     if(t ==delta){
        //         list.add(Arrays.asList(arr[i-1], arr[i]));
        //     }else if (t < delta){
        //         list.clear();
        //         list.add(Arrays.asList(arr[i-1], arr[i]));
        //         delta = t;
        //     }
        // }
        // return list;
        // Used counting sort
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        boolean[] bucket = new boolean[max - min +1];
        for(int i =0; i< arr.length; i++){
            bucket[arr[i]- min] = true;
        }
        List<List<Integer>> list = new ArrayList();
        int delta = Integer.MAX_VALUE;
        int pre = -1;
        for(int i =0; i< bucket.length; i++){
            if(bucket[i]){
                if(pre!=-1){
                    int t = i- pre;
                    if(t ==delta){
                        list.add(Arrays.asList(pre+min, i+min));
                    }else if (t < delta){
                        list.clear();
                        list.add(Arrays.asList(pre+min, i+min));
                        delta = t;
                    }
                }
                pre =i;
            }
            
        }
        return list;
    }
}