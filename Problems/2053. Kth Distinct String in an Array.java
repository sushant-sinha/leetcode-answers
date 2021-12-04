// SUSHANT SINHA

// 59ms ( 8.11% ) 38.3mb ( 99.72% ) or { 57ms ( 8.35% ) 38.4mb ( 96.56% )}

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

// best solution from submission tab
// 3ms ( 100% ) 38.7mb ( 82.67% )

class Solution {
    public String kthDistinct(String[] arr, int k) {
        boolean[] distinct = new boolean[arr.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                distinct[i] = false;
                distinct[map.get(arr[i])] = false;
            } else {
                distinct[i] = true;
                map.put(arr[i], i);
            }
        }
        for (int i = 0; i < distinct.length; i++) {
            if (distinct[i]) k--;
            if (k == 0) return arr[i];
        }
        return "";
    }
}