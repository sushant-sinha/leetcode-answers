// SUSHANT SINHA

class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ans = new LinkedList<>();
        
        int j=1;
        
        for(int i=0;i<target.length;i++){
            
            while(j!=target[i]){
                ans.add("Push");
                ans.add("Pop");
                j++;
            }
            ans.add("Push");
            j++;
        }
                
        return ans;
        
    }
}
