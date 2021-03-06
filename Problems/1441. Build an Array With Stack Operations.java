// SUSHANT SINHA

/*

using LinedList instead of ArrayList for inserting and deleting elements... because its fast..
but if want to fetch elements use ArrayList

*/
// 0ms ( 100% ) 39.7mb ( 6.02% )

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

// using ArrayList 
// 0ms ( 100% ) can be 1ms also, 39.1mb ( 43.59% )

class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ans = new ArrayList<>();
        
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
        
        // if we add System.gc(); in the next line, 39mb ( 57.46% )

        return ans;
        
    }
}