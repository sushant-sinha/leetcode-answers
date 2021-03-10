// SUSHANT SINHA

// 5ms ( 22.33% ) 40mb ( 69.06% )

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int ans[]=new int[k];
        int len=0;
        
        for(int i=0;i<=mat[0].length;i++){
            
            for(int j=0;j<mat.length;j++){
                
                if(!Arrays.asList(ans).contains(j)){
                        int count=0;
                    for(int x:mat[j]){
                        if(x==1){
                            count++;
                        }
                    }
                    if(count==i){
                        ans[len++]=j;
                        if(len==k)return ans;
                    }
                }
                
            }
            
        }
        
        return mat[0];
    }
}

// initially used arraylist to keep track of rows.
// 13ms ( 5.34% ) 40.1mb ( 58.25% )

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        ArrayList<Integer> alr=new ArrayList<>();
        int ans[]=new int[k];
        int len=0;
        
        for(int i=0;i<=mat[0].length;i++){
            
            for(int j=0;j<mat.length;j++){
                
                if(!alr.contains(j)){
                        int count=0;
                    for(int x:mat[j]){
                        if(x==1){
                            count++;
                        }
                    }
                    if(count==i){
                        alr.add(j);
                        ans[len++]=j;
                        System.out.println(len);
                        if(len==k)return ans;
                    }
                }
                
            }
            
        }
        
        return mat[0];
    }
}

// best solution given
// 0ms 40.2mb ( 48.25% )

class Solution {
    public int sumRow(int[] arr){
        int s = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
            s += arr[i];
            }else
                break;
        }
        
        return s;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] fa = new int[mat.length];
        int[] res = new int[k];
        for(int i=0; i<mat.length; i++){
            int sum = sumRow(mat[i])*1000 + i;
            fa[i] = sum;
        }
        Arrays.sort(fa);
        
        for(int i=0; i<k; i++){
            res[i] = fa[i]%1000;
        }
        return res;
    }   
}