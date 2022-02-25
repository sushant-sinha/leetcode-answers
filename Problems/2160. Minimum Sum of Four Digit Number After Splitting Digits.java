class Solution {
    public int minimumSum(int num) {
                
        char ar[]=(""+num).toCharArray();
        
        Arrays.sort(ar);
        
        return Character.getNumericValue(ar[0])*10+Character.getNumericValue(ar[1])*10+Character.getNumericValue(ar[2])+Character.getNumericValue(ar[3]);
        
        
    }
}