// SUSHANT SINHA

// 7ms ( 90.75% ) 39mb ( 70.53% )

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int ans=0,index=boxTypes.length-1;
        
        sortbyColumn(boxTypes, 1);
        
        while(truckSize>0 && index>=0){
            
            int x=truckSize >= boxTypes[index][0] ? boxTypes[index][0] : truckSize;
            
            ans+=boxTypes[index][1]*x;
            
            
            index--;
            truckSize-=x;
            
        }
            
        
        return ans;
        
    }
    
    // from gfg
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
            
          @Override              
          // Compare values according to columns
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            // To sort in descending order revert 
            // the '>' Operator
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  // End of function call sort().
    }
}