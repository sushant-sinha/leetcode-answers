class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        int id1=nums1[0][0], id2=nums2[0][0];
        
        TreeMap<Integer, Integer> temp=new TreeMap<>();
        
        for(int i=0;i<nums1.length;i++){
            
            if(temp.containsKey(nums1[i][0]))
                temp.put(nums1[i][0], temp.get(nums1[i])+nums1[i][1]);
            
            else
                temp.put(nums1[i][0], nums1[i][1]);
            
        }
        
        for(int i=0;i<nums2.length;i++){
            
            if(temp.containsKey(nums2[i][0]))
                temp.put(nums2[i][0], temp.get(nums2[i][0])+nums2[i][1]);
            
            else
                temp.put(nums2[i][0], nums2[i][1]);
            
        }
        
        int ans[][]=new int[temp.size()][2];
        int index=0;
        
        for(Map.Entry<Integer, Integer> x: temp.entrySet()){
            ans[index][0]=x.getKey();
            ans[index++][1]=x.getValue();
        }
        
        return ans;
        
    }
}