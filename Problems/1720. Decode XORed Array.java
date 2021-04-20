// SUSHANT SINHA

class Solution {
    public int[] decode(int[] encoded, int first) {
        
        int ans[]=new int[encoded.length+1];
        
        ans[0]=first;
        
        for(int i=1;i<ans.length;i++)
            
         /*
		
		this is wrong	

        ans[i]= encoded[i-1]-ans[i-1] < 0 ?  -encoded[i-1]+ans[i-1]  : encoded[i-1]-ans[i-1];

        */
            
            ans[i]= encoded[i-1] ^ ans[i-1];
            
        
        return ans;
        
    }
}