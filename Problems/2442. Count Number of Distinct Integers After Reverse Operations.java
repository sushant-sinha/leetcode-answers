// SUSHANT SINHA

// 134ms ( 80.74% ) 123.5mb ( 68.10% )

class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> seen=new HashSet<>();
        
        for(int i:nums){
                
                //System.out.println(i+" "+rev(i));
                seen.add(i);
                seen.add(rev(i));
        }
        
        return seen.size();
        
    }
    
    static int rev(int i){
        
        int ans=i%10;
        i/=10;
        //System.out.println(ans+" hi "+i);
        
        while(i!=0){
            
            ans=(ans*10)+(i%10);
            
            i/=10;
            
        }
        
        return ans;
        
    }
    
}