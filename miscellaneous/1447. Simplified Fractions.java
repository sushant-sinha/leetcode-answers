// SUSHANT SINHA

// 1343ms ( 5.22% ) 39.7mb ( 76.49% )

class Solution {
    public List<String> simplifiedFractions(int n) {
        
        ArrayList<String> ans=new ArrayList<>();
        ArrayList<Float> already=new ArrayList<>();
        
        if(n==1) return ans;
        
        for(int i=1;i<n;i++){
            
            for(int j=i+1;j<=n;j++){
                
                
                float d=(float)i/j;
                if(already.contains(d))continue;
                
                already.add(d);
                ans.add(i+"/"+j);
                
            }
            
        }
        
        return ans;
        
    }
}