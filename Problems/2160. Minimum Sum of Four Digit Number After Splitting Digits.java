// SUSHANT SINHA

// 1ms ( 82.92% ) 41mb ( 50.99% )

class Solution {
    public int minimumSum(int num) {
                
        char ar[]=(""+num).toCharArray();
        
        Arrays.sort(ar);
        
        return Character.getNumericValue(ar[0])*10+Character.getNumericValue(ar[1])*10+Character.getNumericValue(ar[2])+Character.getNumericValue(ar[3]);
        
        
    }
}

// best solution
// 0ms ( 100% )

class Solution {
    public int minimumSum(int num) {
        
       int arr[]={(num / 1000), ((num % 1000) / 100), ((num % 1000) % 100 / 10), num % 10};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return (arr[0]*10+arr[2])+(arr[1]*10+arr[3]);
        
    }
}