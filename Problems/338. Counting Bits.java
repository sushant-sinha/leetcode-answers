// SUSHANT SINHA

class Solution {
    public int[] countBits(int num) {
        
        int ans[] = new int[num+1];
        
        for(int i=0;i<=num;i++){
            
            String s=Integer.toBinaryString(i);
            
            for(char c:s.toCharArray()){
                if(c=='1')
                    ans[i]++;
            }
            
        }
        
        return ans;
        
    }
}