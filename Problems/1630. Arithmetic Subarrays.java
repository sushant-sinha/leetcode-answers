// SUSHANT SINHA

// 15ms ( 77.15% ) 39.4mb ( 66.43% )

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans=new ArrayList<>();
        
        for(int i=0;i<l.length;i++){
            
            int temp[]=new int[r[i]-l[i]+1];
            
            for(int at=l[i];at<=r[i];at++)
                temp[at-l[i]]=nums[at];
            
            Arrays.sort(temp);
            int d=temp[1]-temp[0];
            boolean is=true;
            for(int j=2;j<temp.length;j++){
                
                if((temp[j]-temp[j-1])!=d){
                    is=false;
                    break;
                }
                
            }
            ans.add(is);
            
        }
        
        return ans;
        
    }
}