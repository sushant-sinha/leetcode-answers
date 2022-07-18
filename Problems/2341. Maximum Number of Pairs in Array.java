class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        int ans[]=new int[2];
        
        for(int i:nums){
            
            if(!map.containsKey(i))
                map.put(i,1);
            
            else
                map.put(i, map.get(i)+1);
            
        }
        
        for(Map.Entry e : map.entrySet()){
            
            // System.out.println(n);
            int n=(int)e.getValue();
                
            //System.out.println("yes");
            ans[0]+=n/2;

            //System.out.println(ans[0]);
            ans[1]+=n%2;
                    
        }
        
        return ans;
        
    }
}