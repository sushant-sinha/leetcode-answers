// SUSHANT SINHA

// 211ms ( 15.47% ) 87.1mb ( 20.47% )

class Solution {
    public int maximumSum(int[] nums) {
        
        // mapping of sum and numbers
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        
        for(int i:nums){
            
            int sum=sum(i);
            
            if(map.containsKey(sum)){
                
                //System.out.println("hi");
                
                ArrayList<Integer> temp=map.get(sum);
                
                temp.add(i);
                
                map.put(sum, temp);
                
            }
            
            else{
                
                ArrayList<Integer> temp=new ArrayList<>();
                
                temp.add(i);
                
                map.put(sum, temp);
                
            }
            
        }
        
        // if the number of elements in the hashmap is same as that of the number of elements in the array(input).. this means that no two elements are having the same sum
        if(map.size()==nums.length)
            return -1;
        
        int ans=-1;
            
        // travarsing the map to find the keys which have more than one element in their arraylist.. then find the top two highest values.. keep their sum as ans

        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {

            if(e.getValue().size()!=1){

                ArrayList<Integer> val=e.getValue();

                Collections.sort(val);

                int max1=val.get(val.size()-1);
                int max2=val.get(val.size()-2);

                if(max1+max2>ans)
                    ans=max1+max2;

            }

        }
            
        
        return ans;
        
        
    }
    
    int sum(int i){
        
        int ans=0;
        
        while(i!=0){
            ans+=i%10;
            i/=10;
        }
        
        return ans;
        
    }
    
}

// best solution from the submission section
// 39ms

class Solution {
    public int maximumSum(int[] nums) {
        int res = -1;
        int[][] m = new int[82][2];
        for (int i = 0; i < nums.length; i++) {
            int cur = 0;
            int n = nums[i];
            while(n > 0) {
                cur += (n%10);
                n = n / 10;
            }
            if (m[cur][0] == 0 || m[cur][1] == 0) {
                if (m[cur][0] == 0) m[cur][0] = nums[i];
                else m[cur][1] = nums[i];
            } else {
                int a = m[cur][0];
                int b = m[cur][1];
                int c = nums[i];
                if (a < c || b < c) {
                    if (a < b) {
                        m[cur][0] = c;
                    } else {
                        m[cur][1] = c;
                    }
                }
            }
            if (m[cur][0] != 0 && m[cur][1] != 0) {
                res = Math.max(res, m[cur][0] + m[cur][1]);
            }
        }
        return res;
    }
}