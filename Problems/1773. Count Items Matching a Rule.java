// SUSHANT SINHA

// 3ms ( 98.07% ) 43.5mb ( 72.25% )

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        
        if(ruleKey.equals("type")){
            
            return check(items,0,ruleValue);
            
        }
        else if(ruleKey.equals("color")){
            
            return check(items,1,ruleValue);
            
        }
        else{
            
            return check(items,2,ruleValue);
            
        }
        
        
    }
    
    int check(List<List<String>> items, int k, String ruleValue){
        
        int ans=0;
        
        for(int i=0;i<items.size();i++){
            
            if(items.get(i).get(k).equals(ruleValue))
                ans++;
            
        }
        
        return ans;
        
    }
}