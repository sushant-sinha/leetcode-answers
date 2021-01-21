// SUSHANT SINHA

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ar[]=new int[accounts.length];
        
        for(int i=0;i<accounts.length;i++){
            
            int money[]=accounts[i];
            
            for(int x:money){
                ar[i]+=x;
            }
            
        }
        
        Arrays.sort(ar);
        
        return ar[ar.length-1];
        
    }
}