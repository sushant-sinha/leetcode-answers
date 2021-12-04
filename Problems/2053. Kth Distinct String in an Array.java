// SUSHANT SINHA

// 59ms ( 8.11% ) 38.3mb ( 99.72% )

class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        ArrayList<String> seen=new ArrayList<>();
        
        ArrayList<String> distinct=new ArrayList<>();
        
        for(String s:arr){
            
            if(seen.contains(s)){
                distinct.remove(s);
            }
            
            else{
                distinct.add(s);
                seen.add(s);
            }
            
        }
        
        if(distinct.size()<k)
            return "";
        
        else
            return distinct.get(k-1);
        
    }
}