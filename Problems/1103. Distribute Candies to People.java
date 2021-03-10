// SUSHANT SINHA

// 1ms ( 94.41% ) 38.4mb ( 10.68% )

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
        int ans[]=new int[num_people];
        
        int i=0,cur=1;
        
        while(candies>=0){
            
            if(i==num_people)i=0;
            
            if(candies-cur<=0){
                ans[i++]+=candies;
                candies-=cur;
                cur++;
            }
            else{
                
                ans[i++]+=cur;
                candies-=cur;
                cur++;
                
            }                
            
        }
        
        return ans;
        
    }
}