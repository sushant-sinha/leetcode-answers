// SUSHANT SINHA

// 2ms ( 80.31% ) 38.8mb ( 92.01% )

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        Arrays.sort(target);
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target[i])
                return false;
        }
        
        return true;
        
    }
}

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int test[] = new int[1001];
        
        for(int i=0;i<target.length;i++){
            test[target[i]]++;
            test[arr[i]]--;
        }
        
        for(int i=0;i<test.length;i++){
            if(test[i]!=0)
                return false;
        }
        
        return true;
    }
}