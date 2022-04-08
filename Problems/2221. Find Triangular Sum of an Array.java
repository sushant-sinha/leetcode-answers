// SUSHANT SINHA

// 489ms ( 15.31% ) 123.1mb ( 7.75% )

class Solution {
    public int triangularSum(int[] nums) {
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        for(int i : nums){
            temp.add(i);
        }
        
        while(temp.size()!=1){
            
            temp=generator(temp);
            
        }
        
        return temp.get(0);
        
    }
    
    ArrayList<Integer> generator(ArrayList<Integer> var){
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<var.size()-1;i++){
            
            ans.add( (var.get(i)+var.get(i+1))%10 );
            
        }
        
        
        return ans;
        
    }
    
}