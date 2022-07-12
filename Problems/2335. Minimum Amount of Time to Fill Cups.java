// SUSHANT SINHA

// 2ms ( 55.56% ) 41.4mb ( 66.67% )

class Solution {
    public int fillCups(int[] amount) {
        
        int ans=0;//, max1=0;max2=1;
        
        while(amount[0]!=0 || amount[1]!=0 || amount[2]!=0){
            
            Arrays.sort(amount);
            
            //System.out.println(Arrays.toString(amount));
            
            if(amount[1]!=0){
                amount[2]--;
                amount[1]--;
            }
            
            else
                amount[2]--;
            
            ans++;
        }
        
        return ans;
        
    }
}