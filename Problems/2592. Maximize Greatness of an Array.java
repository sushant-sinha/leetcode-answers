// SUSHANT SINHA

// 248ms ( 12.63% ) 60mb ( 15.28% )

/*

1 3 5 2 1 3 1

1 -> 2 3 3 5 (1) select 2
3 -> 5 (1) select 5
5 -> (0)
2 -> 3 3 (1) select 3
1 -> 3 (1) select 3
3 -> (0)
1 -> (0)

total selected = 4

*/

class Solution {
    public int maximizeGreatness(int[] nums) {
        
        // treemap 
        
        int ans=0;
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i:nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            
            else
                map.put(i,1);
        }
        
        for(int i=0;i<nums.length;i++){
            
            int checkFor=nums[i]+1;
            
            if(map.ceilingKey(checkFor)!=null){
                
                int key=map.ceilingKey(checkFor);
                
                // System.out.println("key="+key);
                
                if(map.get(key)==1){
                    map.remove(key);
                }
                
                else{
                    map.put(key, map.get(key)-1);
                }
                
                ans++;
            }
            
        }
        
        return ans;
        
    }
}

// Best Solution from the submission tab
// 11ms ( 92.46% ) 59.7mb ( 17.13% )

class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int i=0,j=1;
        while(i<=nums.length-1 && j<=nums.length-1)
        {
            if(nums[i]==nums[j])
                j++;
            else
            {
                res++;
                i++;
                j++;
            }
        }
        return res;
        
    }
}