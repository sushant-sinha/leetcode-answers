// SUSHANT SINHA

// 1ms ( 99.69% ) 36.6mb ( 68.48%)

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            
            if(isselfd(i))
                ans.add(i);
            
        }
        
        return ans;
        
    }
    
    boolean isselfd(int n){
        
        int d=n;
        
        while(d%10!=0){
            
            if(n%(d%10)!=0)
                return false;
            
            d=d/10;
            
        }
        
        if(d!=0)
            return false;
        
        return true;
        
        
    }
}