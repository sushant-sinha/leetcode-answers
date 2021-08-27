// SUSSHANT SINHA

// 11ms ( 44.20% ) 39.3mb ( 74.86% )

// no binary search

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int q[]=count(queries);
        int w[]=count(words);
        
        int len=w.length;
        
        Arrays.sort(w);
        
        for(int i=0;i<q.length;i++){
            
            int x=0;
            
            for(;x<w.length && w[x]<=q[i];x++){}
            
            
            q[i]=len-x;
            
        }
        
        
        return q;
        
    }
    
    int[] count(String[] s){
        
        int q[]=new int[s.length];
        
        for(int i=0;i<s.length;i++){
            
            int x=0;
            
            char ar[]=s[i].toCharArray();
            
            Arrays.sort(ar);
            
            for(char c:ar){
                if(c==ar[0])
                    x++;
                else
                    break;
            }
            
            q[i]=x;
            
        }
        
        return q;
        
    }
    
/*    
    int binarySearch(int arr[], int l, int r, int x){
        
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return -1;
    }
    
*/
    
}