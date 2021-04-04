// SUSHANT SINHA

class Solution {
    public int totalMoney(int n) {
        
        int tot=0;
        int cur=0;
        
        for(int i=0;i<n/7;i++){
            
            cur++;
            tot+=week(cur,7);
            
        }
        
        tot+=week(++cur,n%7);
        
        return tot;
        
    }
    
    int week(int start,int days){
        
        int ans=0;
        
        for(int i=0;i<days;i++){
            
            ans+=start++;
            
        }
        
        return ans;
        
    }
    
}