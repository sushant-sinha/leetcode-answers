class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int sum=0, repeated=0;
        
        int n=grid.length;
        
        HashSet<Integer> seen=new HashSet<>();
        
        for(int i[]: grid){
            for(int j: i){
                
                if(seen.contains(j))
                    repeated=j;
                
                else
                    seen.add(j);
                
                sum+=j;
                
            }
        }
        
        int missing = ((n*n)*(n*n+1)/2)-(sum-repeated);
        
        return new int[]{repeated, missing};
        
    }
}