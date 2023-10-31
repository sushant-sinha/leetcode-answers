// SUSHANT SINHA

// 6ms ( 100% ) 43.47 ( 25.00% )

class Solution {
    public int findKOr(int[] nums, int k) {
        
        int binar[]=new int[31];
        
        for(int i:nums){
            
            ArrayList<Integer> bin=helper(i);
            
            int len=Math.min(bin.size(), 31);
            
            for(int x=0;x<len;x++){
                
                binar[x]+=bin.get(x);
                
            }
        }
        
        // System.out.println(Arrays.toString(binar));
        
        int ans=0;
        
        for(int i=0;i<31;i++){
            if(binar[i]>=k)
                ans+=Math.pow(2,i);
        }
        
        return ans;
        
    }
    
    ArrayList<Integer> helper(int n){
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        while(n!=0){
            ans.add(n%2);
            n=n/2;
        }
        
        // System.out.println(ans);
        
        return ans;
    }
}