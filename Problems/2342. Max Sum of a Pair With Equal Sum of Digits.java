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
