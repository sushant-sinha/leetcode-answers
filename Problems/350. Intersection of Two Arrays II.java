// SUSHANT SINHA

// to do
// 0ms ( 100% ) 39mb ( 91.16% )

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ar=new ArrayList();
        
        int[] temp=new int[1001];
        
        for(int i=0;i<nums1.length;i++)
            temp[nums1[i]]++;
        
        for(int i=0;i<nums2.length;i++){
            
            if(temp[nums2[i]]>0){
                
                ar.add(nums2[i]);
                temp[nums2[i]]--;
            }
        }
        
        int[] ans=new int[ar.size()];
        
        for(int i=0;i<ans.length;i++)
            ans[i]=ar.get(i);
        
        return ans;
    }
}