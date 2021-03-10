// SUSHANT SINHA

// 0ms ( 100% )

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(bound==0 || (x==1 && y==1 && bound==1))return ans;
        if(x==1 && y==1){
            ans.add(2);
            return ans;
        }
        
        if(y==1){
            
            for(int i=0;Math.pow(x,i)+1<=(double)bound;i++){
                ans.add( (int)Math.pow(x,i) + 1);
            }
            return ans;
            
        }
        if(x==1){
            
            for(int i=0;Math.pow(y,i)+1<=(double)bound;i++){
                ans.add( (int)Math.pow(y,i) + 1 );
            }
            return ans;
            
        }
        
        for(int i=0;Math.pow(x,i)<=(double)bound;i++){
            
            for(int j=0;Math.pow(y,j)+Math.pow(x,i)<=(double)bound;j++){
                
                if(!ans.contains( (int)Math.pow(x,i) + (int)Math.pow(y,j) )){
                    
                    ans.add( (int)Math.pow(x,i) + (int)Math.pow(y,j) );
                    
                }
                
            }
            
            
        }
        
        return ans;
        
    }
}