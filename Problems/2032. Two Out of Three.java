class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> ans=new ArrayList<>();
        
        int counter[][]=new int[3][100];
        
        for(int i:nums1)
            counter[0][i-1]=1;
        
        for(int i:nums2)
            counter[1][i-1]=1;
        
        for(int i:nums3)
            counter[2][i-1]=1;
        
        for(int i=0;i<100;i++){
            
            //System.out.println(counter[0][i]+counter[1][i]+counter[2][i]+" for "+(i+1));
            
            if(counter[0][i]+counter[1][i]+counter[2][i]>=2)
                ans.add(i+1);
        }
        
        return ans;
        
    }
}