// SUSHANT SINHA 

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> ans=new ArrayList<>();
        
        for(int x[]:matrix){
            
            int i=0;
            
            boolean flag=false;
            
            for(;i<x.length;i++){
                
                ArrayList<Integer> temp=new ArrayList<>();
                
                for (int a:x)
                    temp.add(a);
                
                Collections.sort(temp);
                
                if(x[i]==temp.get(0)){
                    
                    flag=true;
                    break;
                }
                
            }
            
            if(flag){
                
                boolean ck=true;
                
                for(int j=0;j<matrix.length;j++){
                    if(!(matrix[j][i]<=x[i])){
                        ck= false;
                        break;
                        
                    }
                }
                
                if(ck)ans.add(x[i]);
                
            }
            
        }
        
        return ans;
        
    }
}